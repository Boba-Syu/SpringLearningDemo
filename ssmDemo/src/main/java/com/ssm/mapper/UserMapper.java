package com.ssm.mapper;

import com.ssm.entity.User;

import java.util.List;

public interface UserMapper {
    List<User> selectAll();

    User selectById(int uid);

    boolean insert(User user);

    boolean delete(int uid);

    boolean update(User user);
}
