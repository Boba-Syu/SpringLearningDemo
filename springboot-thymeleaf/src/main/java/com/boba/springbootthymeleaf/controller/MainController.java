package com.boba.springbootthymeleaf.controller;

import com.boba.springbootthymeleaf.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @RequestMapping("/")
    public String main(Model model, HttpSession session) {
        model.addAttribute("text", "主页面");
        model.addAttribute("name", "boba");
        session.setAttribute("text", "Hello World!");
        return "main";
    }

    @RequestMapping("demo")
    public String demo(Model model){
        model.addAttribute("text1", "AAA");
        List<User> list = new ArrayList<>();
        list.add(new User(1,"aaa","123"));
        list.add(new User(2,"bbb","456"));
        list.add(new User(3,"ccc","789"));
        model.addAttribute("list",list);
        return "demo";
    }
}
