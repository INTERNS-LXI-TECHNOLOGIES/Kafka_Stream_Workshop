package com.diviso.gateway.web.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.gateway.domain.Employee;
import com.diviso.gateway.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeResource {
	
	private EmployeeService employeeService;
	
	public EmployeeResource(EmployeeService employeeService) {
		this.employeeService=employeeService;
	}
	
	
	@PostMapping("/employee")
	public boolean registerEmployee(@RequestBody Employee employee) {
		
		return employeeService.send(employee);
	}

}
