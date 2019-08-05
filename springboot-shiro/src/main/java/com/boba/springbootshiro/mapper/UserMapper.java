package com.boba.springbootshiro.mapper;

import com.boba.springbootshiro.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from s_user where username = #{username}")
    User findByUsername(String username);
}
