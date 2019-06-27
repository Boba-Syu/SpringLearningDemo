package com.boba;

import com.boba.domain.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("META-INF/ApplicationContext.xml");
        HelloWorld helloWorld = (HelloWorld)ac.getBean("helloworld");
        System.out.println(helloWorld.getMessage());
    }
}
