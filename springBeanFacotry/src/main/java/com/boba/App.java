package com.boba;

import com.boba.domain.BeanHelloWorld;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        /*该方法已经不再推荐使用*/
        /*XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("META-INF/ApplicationContext.xml"));
        BeanHelloWorld beanHelloWorld = (BeanHelloWorld)xmlBeanFactory.getBean("beanHelloWorld");
        System.out.println(beanHelloWorld.getMessage());*/

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/ApplicationContext.xml");
        BeanHelloWorld beanHelloWorld1 = (BeanHelloWorld) ctx.getBean("beanHelloWorld");
        System.out.println(beanHelloWorld1.getMessage());
    }
}
