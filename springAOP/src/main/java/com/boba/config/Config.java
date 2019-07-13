package com.boba.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy //开启AOP
@Configuration
@ComponentScan("com.boba")
public class Config {
}
