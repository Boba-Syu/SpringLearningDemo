package com.boba;

import com.boba.entity.User;
import com.boba.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("META-INF/mybatis-cfg.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        System.out.println("--------------查询集合--------------");
        List<User> list = sqlSession.getMapper(UserMapper.class).selectAll();
        for(User user: list) {
            System.out.println(user);
        }

        System.out.println("-------------带参数查询-------------");
        User user = sqlSession.getMapper(UserMapper.class).selectById(1);
        System.out.println(user);


        System.out.println("--------------动态查询-------------");
        user.setUname(null);
        List<User> list1 = sqlSession.getMapper(UserMapper.class).select(user);
        for(User u: list1) {
            System.out.println(u);
        }

        sqlSession.close();
    }
}
