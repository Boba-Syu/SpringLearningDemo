package com.boba.springbootvalidation.controller;

import com.boba.springbootvalidation.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String add() {
        return "add";
    }

    @RequestMapping("/save")
    public String save(@Validated User user, BindingResult result, Model model) {
        System.out.println(user);
        if (result.hasErrors()) {
            model.addAttribute("error", result.getFieldError().getDefaultMessage());
            return "add";
        }
        return "ok";
    }

}
