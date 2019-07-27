package com.boba.test.config;

import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 配置持久层的一些东西，包括数据库、Mybatis框架，事务之类的东西
 */
@Configuration
@ComponentScan(basePackages = {"com.boba.test.config", "com.boba.test.mapper", "com.boba.test.service"})
@Import(DruidDataSourceConfig.class)
public class RootConfig {

    @Bean
    public BeanNameAutoProxyCreator proxycreate() {
        BeanNameAutoProxyCreator proxycreate = new BeanNameAutoProxyCreator();
        proxycreate.setProxyTargetClass(true);
        proxycreate.setBeanNames("*ServiceImpl");
        proxycreate.setInterceptorNames("transactionInterceptor");
        return proxycreate;
    }
}
