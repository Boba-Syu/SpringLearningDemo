package com.boba.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by MI on 2019/7/4.
 */
@Component("people") // 和下面三个注解等价
//@Controller  表示这是在控制层
//@Service  表示是在服务层
//@Repository  表示是在映射层
@Scope(scopeName = "singleton") // 配置作用域
public class People {
    @Value("boba") // 值类型注入,引用类型用Qualifier注解 也可加在setter方法上
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                '}';
    }
}
