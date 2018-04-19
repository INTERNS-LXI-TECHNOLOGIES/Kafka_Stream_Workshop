
package com.diviso.payment;

import org.springframework.cloud.stream.annotation.EnableBinding;

import com.diviso.payment.stream.PaymentStream;

@EnableBinding(PaymentStream.class)
public class PaymentConfig {

}
