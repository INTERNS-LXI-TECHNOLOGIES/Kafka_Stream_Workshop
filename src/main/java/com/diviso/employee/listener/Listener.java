package com.diviso.employee.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.diviso.employee.pojo.EmployePojo;
import com.diviso.employee.stream.Stream;

/**
 * @author vineeth
 * Apr 18, 2018 10:07:32 AM
 *
 */
@Component
public class Listener {
	Logger log = LoggerFactory.getLogger(Listener.class);
	
	
	@StreamListener(Stream.EMPLOYEREGISTRATION)
	public void listenToRegistration(@Payload EmployePojo employepojo) {
		log.info("employee is "+employepojo);
	}
	
	
	
	@StreamListener(Stream.EMPLOYEETOPIC)
	public void listenToSalePoint(@Payload EmployePojo employepojo) {
		log.info("dbfdsgfdbjfgsdfhdgjf"+employepojo);
	}
	
	
	
	
	
	
}
