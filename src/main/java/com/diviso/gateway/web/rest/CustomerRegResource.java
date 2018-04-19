package com.diviso.gateway.web.rest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.gateway.domain.Customer;
import com.diviso.gateway.service.CustomerServiceImpl;



/**
 * REST controller for managing the current user's account.
 */
@RestController
@RequestMapping("/api")
public class CustomerRegResource {

    private final Logger log = LoggerFactory.getLogger(CustomerRegResource.class);

    CustomerServiceImpl customerService;
    
    public CustomerRegResource(CustomerServiceImpl customerService) {
    	this.customerService=customerService;
	}
    /**
     * GET  /authenticate : check if the user is authenticated, and return its login.
     *
     * @param request the HTTP request
     * @return the login if the user is authenticated
     */
    @PostMapping("/customer")
    public String createCustomer(@RequestBody Customer customer) {
    	
        log.info("REST request to  Create Customer : {}",customer.getName());
        customerService.send(customer);
        
        return "SuccessFul";
    }

}
