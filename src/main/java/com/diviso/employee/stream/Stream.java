package com.diviso.employee.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author vineeth
 * Apr 18, 2018 10:04:14 AM
 *
 */
public interface Stream {
	public static final  String EMPLOYEREGISTRATION ="registration";
	
	public static final  String EMPLOYEETOPIC= "salespoint";
	
	public static final String EMPLOYEETOPICout ="message";
	
    @Input(EMPLOYEREGISTRATION)
    SubscribableChannel readRegistration();
    
    @Input(EMPLOYEETOPIC)
    SubscribableChannel readSalespoint();
    
    @Output(EMPLOYEETOPICout)
    MessageChannel write();

	
    
}
