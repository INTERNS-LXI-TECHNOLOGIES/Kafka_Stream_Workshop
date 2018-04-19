package com.diviso.gateway;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;

/**
 * Configures Spring Cloud Stream support.
 *
 * See http://docs.spring.io/spring-cloud-stream/docs/current/reference/htmlsingle/
 * for more information.
 */
@EnableBinding(MessageStream.class)
public class MessagingConfiguration {

}
