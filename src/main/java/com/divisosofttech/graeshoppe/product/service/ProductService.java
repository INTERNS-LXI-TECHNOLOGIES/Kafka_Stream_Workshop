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
package com.divisosofttech.graeshoppe.product.service;

import org.springframework.messaging.handler.annotation.Payload;

import com.divisosofttech.graeshoppe.product.model.Product;
import com.divisosofttech.graeshoppe.product.model.Sale;


/**
 * @author UVAIZ K UMER
 *
 */
public interface ProductService {
	
	public void listenToMessage(@Payload Product product);
	
	public boolean sendMessage(Product product);
	
	public void listeningSale(@Payload Sale sale);
	
	public boolean sendSale(Sale sale);

}
