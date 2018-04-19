/**
 * 
 */
package com.divisosofttech.graeshoppe.product.model;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author UVAIZ K UMER
 *
 */
@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class Sale {
	
	private Long transactionId;
	private Long productId;
	private Long total;
	private Long customerId;
	private String status;
	
//	enum Status{
//		SUCCESS,FAILED,PROCESSING
//	}
	

}
