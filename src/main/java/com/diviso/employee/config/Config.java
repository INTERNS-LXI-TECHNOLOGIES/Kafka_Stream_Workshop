package com.diviso.employee.config;

import org.springframework.cloud.stream.annotation.EnableBinding;

import com.diviso.employee.stream.Stream;

/**
 * @author vineeth
 * Apr 18, 2018 10:09:42 AM
 *
 */
@EnableBinding(Stream.class)
public class Config {

}
