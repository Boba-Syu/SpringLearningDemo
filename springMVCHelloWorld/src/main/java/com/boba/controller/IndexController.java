package com.boba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("demo")
    public String helloWorld() {
        System.out.println("main");
        return "index";
    }
}
