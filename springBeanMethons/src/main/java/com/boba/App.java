package com.boba;

import com.boba.entity.People;
import com.boba.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
        /* 测试单例模式singleton, 获得的对象都是同一个 */
        System.out.println("---------singleton测试-----------");
        People people1 = (People) ac.getBean("people1");
        People people2 = (People) ac.getBean("people1");
        System.out.println(people1);
        System.out.println(people2);
        people1.setName("123");
        System.out.println(people1);
        System.out.println(people2);

        /*测试原型模式prototype, 每次获得的都是新对象 */
        System.out.println("----------prototype测试----------");
        people1 = (People) ac.getBean("people2");
        people2 = (People) ac.getBean("people2");
        System.out.println(people1);
        System.out.println(people2);
        people1.setName("123");
        System.out.println(people1);
        System.out.println(people2);

        /*测试原型模式prototype, 每次获得的都是新对象 */
        System.out.println("----------生命周期和后置处理器测试----------");
        AbstractApplicationContext aac = new ClassPathXmlApplicationContext("META-INF/applicationContext2.xml");

        /* 在容器创建前, 还未从容器中获取时, init-method就被调用 */
        People people3 = (People) aac.getBean("people3");
        System.out.println(people3);
        aac.registerShutdownHook(); //正常关闭, 触发调用的destory方法

        /* bean继承 */
        System.out.println("----------spring bean定义继承-------------");
        User user = (User) ac.getBean("user");
        System.out.println(user);
    }
}
