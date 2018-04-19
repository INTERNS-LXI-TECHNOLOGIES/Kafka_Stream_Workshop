package com.diviso.employee.service;

import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;
import org.springframework.util.MimeTypeUtils;

import com.diviso.employee.pojo.EmployePojo;
import com.diviso.employee.stream.Stream;

/**
 * @author vineeth
 * Apr 18, 2018 10:10:53 AM
 *
 */
@Component
public class Service {
	
public final Stream	stream;
	
	
       public  Service(Stream stream) {
		this.stream=stream;
		
	}
	public boolean sendMessage(EmployePojo employepojo) {
		
		
		String d =employepojo.getStatus().toString();
		MessageChannel messagechanel= stream .write();
			
		boolean message = messagechanel.send(
				MessageBuilder.withPayload(d)
				.setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils
			    .APPLICATION_JSON).build()) ;
		return message;
		
	}
	
	
}
