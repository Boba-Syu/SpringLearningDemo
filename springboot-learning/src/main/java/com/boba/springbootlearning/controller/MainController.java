package com.boba.springbootlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @RequestMapping("main")
    @ResponseBody
    public String HelloWorld() {
        return "Hello World! ";
    }

    @RequestMapping("demo")
    public String main() {
        return "main";
    }
}
