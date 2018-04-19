package com.diviso.gateway.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.gateway.domain.Payment;
import com.diviso.gateway.service.PaymentService;


@RestController
@RequestMapping("/api")
public class PaymentResource {

	private final Logger log = LoggerFactory.getLogger(PaymentResource.class);
	
	@Autowired
	private PaymentService paymentService;
	
	@PostMapping("/payment")
	public boolean createPayment(@RequestBody Payment payment) {
		log.info("Payment creation : {} ", payment);
		
		return paymentService.save(payment);
	}

}
