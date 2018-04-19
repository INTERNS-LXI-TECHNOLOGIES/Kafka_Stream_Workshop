package com.diviso.gateway;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MessageStream {

	String PRODUCTOUTPUT="productoutput";
	
	String SALEOUTPUT="saleoutput";
	
	String REGISTRATIONOUTPUT="registrationoutput";
	
	String PAYMENTOUTPUT="paymentoutput";
	
	String CUSTOMERINPUT="customerInput";
	
	
	@Output(PRODUCTOUTPUT)
	MessageChannel getProductOutputStream();
	
	@Output(SALEOUTPUT)
	MessageChannel getSaleOutputStream();
	
	@Output(REGISTRATIONOUTPUT)
	MessageChannel getRegistrationOutputStream();
	
	@Output(PAYMENTOUTPUT)
	MessageChannel getPaymentOutputStream();
	
	
}
