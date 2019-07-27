package com.boba.springbootmybatis.service.impl;

import com.boba.springbootmybatis.entity.User;
import com.boba.springbootmybatis.mapper.UserMapper;
import com.boba.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    public User selectById(int uid) {
        return userMapper.selectById(uid);
    }

    @Override
    public boolean insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public boolean delete(int uid) {
        return userMapper.delete(uid);
    }

    @Override
    public boolean update(User user) {
        return userMapper.update(user);
    }
}
