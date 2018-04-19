package com.diviso.gateway.service.impl;

import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import com.diviso.gateway.MessageStream;
import com.diviso.gateway.domain.Product;
import com.diviso.gateway.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	
	private final MessageStream MESSAGE_STREAM;

	public ProductServiceImpl(MessageStream MESSAGE_STREAM) {
		this.MESSAGE_STREAM = MESSAGE_STREAM;
	}
	@Override
	public boolean send(Product product) {
		return MESSAGE_STREAM.getProductCreation().send(MessageBuilder.withPayload(product)
				.setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build());

	}

}
