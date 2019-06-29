package com.boba.factory;

import com.boba.entity.User;

/**
 * Created by MI on 2019/6/29.
 * 静态工厂
 */
public class StaticFactory {
    public static User createUser() {
        return new User(6,"createByStaticUser");
    }
}
