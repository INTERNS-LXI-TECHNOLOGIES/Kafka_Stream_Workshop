package com.diviso.gateway.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diviso.gateway.domain.Sale;
import com.diviso.gateway.service.SaleService;


/**
 * REST controller for managing sale
 */
@RestController
@RequestMapping("/api")
public class SaleResource {
	
	private final Logger log = LoggerFactory.getLogger(SaleResource.class);
	 
	 private final SaleService saleService;
	 
	 public SaleResource(SaleService saleService) {
		 this.saleService = saleService;
	 }
	 
	 @PostMapping("/sale")
	 public boolean salePublish(@RequestBody Sale sale) {
		log.debug("REST request to create sale event by sale"+sale);
		
		return saleService.send(sale); 		
	 }

}
