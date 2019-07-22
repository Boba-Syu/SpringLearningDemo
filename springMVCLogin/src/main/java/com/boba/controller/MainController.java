package com.boba.controller;

import com.boba.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
public class MainController {
    @RequestMapping("main")
    public String index(User user, HttpServletResponse response) {
        System.out.println(user);
        return "main";
    }

    /**
     * 加上@ResponseBod这个注解后该方法就不会跳转页面, 而是将返回值作为信息传过去
     *  若返回值为Key-Value形式(实体类, map等), 响应头会变为"application/json;charset=utf-8", 返回值一流形式传输
     * @return
     */
    @RequestMapping(value = "/str")
    @ResponseBody
    public User str() {
        User user = new User();
        user.setUname("Boba");
        user.setPwd("123");
        return user;
    }
}
