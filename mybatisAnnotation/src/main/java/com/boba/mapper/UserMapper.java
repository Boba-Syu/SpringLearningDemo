package com.boba.mapper;

import com.boba.entity.User;
import com.boba.mapper.sqlProvider.UserSqlProvider;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

public interface UserMapper {

    /**
     * 使用注解配置, 可以少些Mapper.xml文件
     * @return
     */
    @Select("select * from user")
    List<User> selectAll();

    @Select("select * from user where uid = #{uid}")
    User selectById(int uid);

    @SelectProvider(type = UserSqlProvider.class, method = "select")
    List<User> select(User user);
}
