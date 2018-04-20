package com.diviso.payment.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface PaymentStream {

	String PAYMENT_IN = "payment-in";
	String PAYMENT_OUT = "payment-out";

	@Input(PAYMENT_IN)
	SubscribableChannel readMessage();

	@Output(PAYMENT_OUT)
	MessageChannel writeMessage();

}
