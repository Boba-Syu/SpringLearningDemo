package com.boba;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by MI on 2019/7/4.
 */
@Configuration // 表明这是一个配置类
@ComponentScan("com.boba.entity") // 扫描该包下的类, 带有注解的配置加入到spring容器中
public class Config {
}
