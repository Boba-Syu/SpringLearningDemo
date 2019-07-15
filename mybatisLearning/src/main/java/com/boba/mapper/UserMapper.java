package com.boba.mapper;

import com.boba.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> selectAll();

    User selectById(@Param("uid") int uid);

    List<User> select(User user);

    List<User> selectForeach(@Param("list") List list);

}
