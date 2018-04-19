package com.diviso.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.employee.pojo.EmployePojo;
import com.diviso.employee.service.Service;

/**
 * @author vineeth
 * Apr 18, 2018 12:34:50 PM
 *
 */
@RestController
public class Controller {

private  Service service;
	
	
	
	
	/*@GetMapping("api/employee")
	public boolean postMessage (){
		EmployePojo pojo = new EmployePojo();
		
		pojo.setName("vineeth");
		
		
		return this.service.sendMessage(pojo);
	}*/
	
	@PostMapping("api/employee")
    public boolean createCustomer(@RequestBody EmployePojo employepojo) {
    	
        
         return service.sendMessage(employepojo);
        
    }
	
	
		
	
}
