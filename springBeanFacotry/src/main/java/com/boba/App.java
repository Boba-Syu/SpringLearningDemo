package com.boba;

import com.boba.domain.BeanHelloWorld;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("META-INF/ApplicationContext.xml"));
        BeanHelloWorld beanHelloWorld = (BeanHelloWorld)xmlBeanFactory.getBean("beanHelloWorld");
        System.out.println(beanHelloWorld.getMessage());
    }
}
