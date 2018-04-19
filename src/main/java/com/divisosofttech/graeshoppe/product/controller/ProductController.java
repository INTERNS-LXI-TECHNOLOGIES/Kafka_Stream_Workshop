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
package com.divisosofttech.graeshoppe.product.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

import com.divisosofttech.graeshoppe.product.service.impl.ProductServiceImpl;



/**
 * @author UVAIZ K UMER
 *
 */
@RestController
public class ProductController {
	
	private final ProductServiceImpl productService;
	
	
	private final Logger log = LoggerFactory.getLogger(ProductController.class);
	
	/**
	 * 
	 */
	public ProductController(ProductServiceImpl productService) {
		// TODO Auto-generated constructor stub
		
		this.productService = productService;
	}
	
	

}
