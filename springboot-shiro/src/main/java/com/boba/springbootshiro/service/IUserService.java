package com.boba.springbootshiro.service;

import com.boba.springbootshiro.entity.User;

public interface IUserService {
    User findByUsername(String username);
}
