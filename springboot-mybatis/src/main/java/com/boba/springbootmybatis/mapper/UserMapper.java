package com.boba.springbootmybatis.mapper;

import com.boba.springbootmybatis.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> selectAll();

    User selectById(int uid);

    boolean insert(User user);

    boolean delete(int uid);

    boolean update(User user);
}
