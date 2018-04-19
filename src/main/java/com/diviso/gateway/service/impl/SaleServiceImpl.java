package com.diviso.gateway.service.impl;

import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import com.diviso.gateway.MessageStream;
import com.diviso.gateway.domain.Sale;
import com.diviso.gateway.service.SaleService;

@Service
public class SaleServiceImpl implements SaleService {

	private final MessageStream MESSAGE_STREAM;

	public SaleServiceImpl(MessageStream MESSAGE_STREAM) {
		this.MESSAGE_STREAM = MESSAGE_STREAM;
	}
	
	@Override
	public boolean send(Sale sale) {
		return MESSAGE_STREAM.getSaleEventTopic().send(MessageBuilder.withPayload(sale)
				.setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build());

	}

}
