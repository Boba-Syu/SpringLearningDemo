package com.boba;

import com.boba.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        /* 根据name来自动装配 */
        User user = ac.getBean("user", User.class);
        System.out.println(user);
        /* 根据type来自动装配 */
        user = ac.getBean("user2", User.class);
        System.out.println(user);
    }
}
