package com.diviso.gateway.service.impl;

import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import com.diviso.gateway.MessageStream;
import com.diviso.gateway.domain.Customer;
import com.diviso.gateway.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	private final MessageStream MESSAGE_STREAM;

	public CustomerServiceImpl(MessageStream MESSAGE_STREAM) {
		this.MESSAGE_STREAM = MESSAGE_STREAM;
	}

	@Override
	public boolean send(Customer customer) {

		return MESSAGE_STREAM.getCustomerRegistrationTopic().send(MessageBuilder.withPayload(customer)
				.setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build());

	}

}
