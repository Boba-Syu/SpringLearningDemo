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
        User user = (User) ac.getBean("user");
        System.out.println(user.getId());
        /* 遍历list */
        for (String data : user.getList()) {
            System.out.println(data);
        }

        /* 遍历map */
        for (int k : user.getMap().keySet()) {
            System.out.println("" + k + ":" + user.getMap().get(k));
        }
    }
}
