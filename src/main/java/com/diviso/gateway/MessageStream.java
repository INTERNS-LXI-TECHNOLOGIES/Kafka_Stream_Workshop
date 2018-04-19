package com.diviso.gateway;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MessageStream {

	String PRODUCTCREATION="productCreation";
	
	String SALEEVENTTOPIC="saleEvent";
	
	String CUSTOMERREGISTRATIONTOPIC="cutomerRegistration";
	
	String EMPLOYEEREGISTRATIONTOPIC="employeeRegistration";
	
	
	@Output(PRODUCTCREATION)
	MessageChannel getProductCreation();
	
	@Output(SALEEVENTTOPIC)
	MessageChannel getSaleEventTopic();
	
	@Output(CUSTOMERREGISTRATIONTOPIC)
	MessageChannel getCustomerRegistrationTopic();
	
	@Output(EMPLOYEEREGISTRATIONTOPIC)
	MessageChannel getEmployeeRegistration();
	
	
}
