/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.divisosofttech.graeshoppe.product.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import com.divisosofttech.graeshoppe.product.model.Product;
import com.divisosofttech.graeshoppe.product.model.Sale;
import com.divisosofttech.graeshoppe.product.service.ProductService;
import com.divisosofttech.graeshoppe.product.stream.ProductStream;

import lombok.extern.slf4j.Slf4j;



/**
 * @author UVAIZ K UMER
 *
 */
@Service
@Slf4j
public class ProductServiceImpl implements ProductService{

	//private final Logger log = LoggerFactory.getLogger(ProductServiceImpl.class);

	private final ProductStream productStream;

	/**
	 * 
	 */
	public ProductServiceImpl(ProductStream productStream) {
		// TODO Auto-generated constructor stub
		this.productStream = productStream;
	}
	
	@StreamListener(ProductStream.PRODUCT_TOPIC)
	public void listenToMessage(@Payload Product product) {
		log.info("get Message{}" , product);
		sendMessage(product);
	}
	
	public boolean sendMessage(Product product) {
		log.info("Listening");
		
		MessageChannel messageChannel = productStream.write();
		
		boolean message = messageChannel.send(
				MessageBuilder.withPayload(product)
				.setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build()
				) ;
		
		return message;
	}

	@Override
	@StreamListener(ProductStream.SALEIN_TOPIC)
	public void listeningSale(@Payload Sale sale) {
		// TODO Auto-generated method stub
		
		System.out.println("customer Id : "+sale.getCustomerId()+",  Product Id : "+sale.getProductId()+"Total :"+sale.getTotal());
		String status[ ]=new String[3];
		status[0]="SUCCESS";
		status[1]=" FAILED";
		status[2]="PROCESSING";
		 int rand=(int)(Math.random()*3);
		 sale.setStatus(status[rand]);
		 log.info("SALE IS "+sale.getStatus());
		 
		
	}

	@Override
	public boolean sendSale(Sale sale) {
		// TODO Auto-generated method stub
log.info("Listening Sale");
		
		MessageChannel messageChannel = productStream.write();
		
		boolean message = messageChannel.send(
				MessageBuilder.withPayload(sale)
				.setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build()
				) ;
		
		return message;
	}

}
