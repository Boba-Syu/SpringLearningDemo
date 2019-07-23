package com.ssm.controller;

import com.ssm.entity.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("main")
    public String main() {
        return "main";
    }

    @RequestMapping("selectAll")
    @ResponseBody
    public List<User> selectAll() {
        return userService.selectAll();
    }

    @RequestMapping("selectById")
    @ResponseBody
    public User SelectById(int uid) {
        return userService.selectById(uid);
    }

    @RequestMapping("update")
    @ResponseBody
    public boolean update(User user) {
        return userService.update(user);
    }

    @RequestMapping("insert")
    @ResponseBody
    public boolean insert(User user) {
        return userService.insert(user);
    }

    @RequestMapping("delete")
    @ResponseBody
    public boolean delete(int uid) {
        return userService.delete(uid);
    }

}
