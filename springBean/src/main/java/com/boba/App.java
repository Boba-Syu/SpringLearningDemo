package com.boba;

import com.boba.entity.People;
import com.boba.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");

        /*有参数的构造方法, 产生后id和name都有值*/
        User user1 = ac.getBean("user1", User.class);
        System.out.println(user1);

        /*无参数的构造方法, 产生后id和name都没有值*/
        User user2 = (User) ac.getBean("user2");
        System.out.println(user2);
    }
    @Test
    public void test1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");

        /*setter方法注入, 必须有对应的setter方法*/
        User user3 = (User) ac.getBean("user3");
        System.out.println(user3);

        /*setter方法注入, 使用了p-namespace, 必须有对应的setter方法*/
        User user4 = (User) ac.getBean("user4");
        System.out.println(user4);

        /*引用类型注入*/
        People people = ac.getBean("people", People.class);
        System.out.println(people);
    }
}
