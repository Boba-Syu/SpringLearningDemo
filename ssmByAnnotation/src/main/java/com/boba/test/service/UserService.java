package com.boba.test.service;

import com.boba.test.entity.User;

import java.util.List;

public interface UserService {

    List<User> selectAll();

    User selectById(int uid);

    boolean insert(User user);

    boolean delete(int uid);

    boolean update(User user);
}
