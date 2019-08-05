package com.boba.springbootshiro.service.impl;

import com.boba.springbootshiro.entity.User;
import com.boba.springbootshiro.mapper.UserMapper;
import com.boba.springbootshiro.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  implements IUserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }
}
