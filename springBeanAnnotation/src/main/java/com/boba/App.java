package com.boba;

import com.boba.entity.People;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        People people = (People) ac.getBean("people");
        System.out.println(people);
    }
}
