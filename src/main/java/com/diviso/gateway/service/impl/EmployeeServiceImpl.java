package com.diviso.gateway.service.impl;

import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import com.diviso.gateway.MessageStream;
import com.diviso.gateway.domain.Employee;
import com.diviso.gateway.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {
	
	private final MessageStream MESSAGE_STREAM;

	public EmployeeServiceImpl(MessageStream MESSAGE_STREAM) {
		this.MESSAGE_STREAM = MESSAGE_STREAM;
	}

	@Override
	public boolean send(Employee employee) {
		log.info("Employee is "+employee);
		return MESSAGE_STREAM.getEmployeeRegistration().send(MessageBuilder.withPayload(employee)
				.setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build());

	}

}
