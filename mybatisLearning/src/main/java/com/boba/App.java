package com.boba;

import com.boba.entity.User;
import com.boba.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
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

        //两种方式都行
        //List<User> users = sqlSession.selectList("com.boba.mapper.UserMapper.selectAll");
        List<User> users = (List<User>) sqlSession.getMapper(UserMapper.class).selectAll();
        for (User user : users) {
            System.out.println(user);
        }

        //带有参数的查询语句
        System.out.println("----------带有参数的查询语句----------");
        User user = sqlSession.getMapper(UserMapper.class).selectById(1);
        System.out.println(user);

        //动态查询
        System.out.println("---------------动态查询--------------");
        User user1 = new User();
        user1.setUid(1);
        List<User> users1 = (List<User>) sqlSession.getMapper(UserMapper.class).select(user1);
        for (User u : users1) {
            System.out.println(u);
        }

        //foreach查询
        System.out.println("-------------foreach查询-------------");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        List<User> users2 = (List<User>) sqlSession.getMapper(UserMapper.class).selectForeach(list);
        for (User u : users2) {
            System.out.println(u);
        }
        sqlSession.close();
    }
}
