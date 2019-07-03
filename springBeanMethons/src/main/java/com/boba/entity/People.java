package com.boba.entity;

/**
 * Created by MI on 2019/7/3.
 */
public class People {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init() {
        System.out.println("People的初始化方法");
    }

    public void destroy() {
        System.out.println("People的销毁方法");
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                '}';
    }
}
