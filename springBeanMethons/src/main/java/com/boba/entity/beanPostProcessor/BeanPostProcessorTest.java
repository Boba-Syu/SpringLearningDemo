package com.boba.entity.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by MI on 2019/7/3.
 */
public class BeanPostProcessorTest implements BeanPostProcessor {
    /* 调用初始化方法前调用 */
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("调用在初始化方法前 : " + beanName);
        return bean;
    }
    /* 调用初始化方法后调用 */
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("调用在初始化方法后 : " + beanName);
        return bean;
    }
}
