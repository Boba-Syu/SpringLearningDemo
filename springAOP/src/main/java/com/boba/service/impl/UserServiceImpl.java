package com.boba.service.impl;

import com.boba.service.IUserService;
import org.springframework.stereotype.Service;

@Service("service")
public class UserServiceImpl implements IUserService {
    @Override
    public void fun() {
        System.out.println("fun()调用. ");
    }
}
