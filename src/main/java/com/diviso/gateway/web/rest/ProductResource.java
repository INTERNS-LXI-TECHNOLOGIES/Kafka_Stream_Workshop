package com.diviso.gateway.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.gateway.domain.Product;

import com.diviso.gateway.service.ProductService;


/**
 * REST controller for managing the current user's account.
 */
@RestController
@RequestMapping("/api")
public class ProductResource {

	private final Logger log = LoggerFactory.getLogger(CustomerRegResource.class);

	ProductService productService;
    
    public ProductResource(ProductService productService) {
    	this.productService=productService;
	}
    /**
     * GET  /authenticate : check if the user is authenticated, and return its login.
     *
     * @param request the HTTP request
     * @return the login if the user is authenticated
     */
    @PostMapping("/product")
    public String createProduct(@RequestBody Product product) {
    	
        log.info("REST request to  Create Product : {}",product.getName());
        productService.send(product);
        
        return "SuccessFul";
    }
	
}
