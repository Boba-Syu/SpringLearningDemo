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
        String resource = "META-INF/Mybatis-cfg.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //使用工厂设计模式,生产session
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //List<User> users = sqlSession.selectList("com.boba.mapper.UserMapper.selectAll");
        List<User> users = (List<User>) sqlSession.getMapper(UserMapper.class).selectAll();
        for(User user:users) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}
