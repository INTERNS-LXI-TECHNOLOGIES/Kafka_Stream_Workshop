package com.diviso.payment.service;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;
import org.springframework.util.MimeTypeUtils;

import com.diviso.payment.model.Payment;
import com.diviso.payment.stream.PaymentStream;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class PaymentService {

	public final PaymentStream paymentStream;

	public PaymentService(PaymentStream paymentStream) {

		this.paymentStream = paymentStream;
	}

	@StreamListener(PaymentStream.PAYMENT_IN)
	public void subscribeMessages(@Payload Payment payment) {
		String[] status = new String[3];
		status[0] = "PAYMENT SUCCESSFUL";
		status[1] = "PAYMENT UN-SUCCESSFUL";
		status[2] = "PAYMENT CANCELLED";
		int a = (int) (Math.random() * 3);
		payment.setStatus(status[a]);
		log.info("Payment PaymentMethod is" + payment.getPaymentMethod());
		log.info("Payment Status is" + payment.getStatus());
		log.info("Payment Total is" + payment.getTotal());
		log.info("Payment TransactionId is" + payment.getTransactionId());
		sendMessageToChannel(payment);
		
	}

	private void sendMessageToChannel(Payment payment) {
		log.info("Message sending through channel");
		paymentStream.writeMessage().send(
				MessageBuilder.withPayload(payment)
				.setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build()
				) ;
		
	}

}
