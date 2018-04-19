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
package com.divisosofttech.graeshoppe.product.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author UVAIZ K UMER
 *
 */
public interface ProductStream {
	
	
	public static final String PRODUCT_TOPIC = "messages-in";
	
	public static final String PRODUCT_OUTTOPIC = "messages-out";
	
	@Input(PRODUCT_TOPIC)
	public SubscribableChannel read();
	
	@Output(PRODUCT_OUTTOPIC)
	public MessageChannel write();
	
	public static final String SALEIN_TOPIC = "sales-in"; 
	
	public static final String SALEOUT_TOPIC = "sales-out";
	
	@Input(SALEIN_TOPIC)
	public SubscribableChannel readSale();
	
	@Output(SALEOUT_TOPIC)
	public MessageChannel writeSale();
	

}
