package com.boba;

import com.boba.config.Config;
import com.boba.service.IUserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        IUserService userService = (IUserService) ac.getBean("service");
        userService.fun();
    }
}
