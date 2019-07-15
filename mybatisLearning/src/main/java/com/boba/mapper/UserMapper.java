package com.boba.mapper;

import com.boba.entity.User;

import java.util.List;

public interface UserMapper {
    List<User> selectAll();

    User selectById(int id);

}
