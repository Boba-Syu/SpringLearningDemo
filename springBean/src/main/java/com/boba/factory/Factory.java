package com.boba.factory;

import com.boba.entity.User;

/**
 * Created by MI on 2019/6/29.
 * 实例工厂
 */
public class Factory {
    public User createrUser(){
        return new User(5,"createByFactory");
    }
}
