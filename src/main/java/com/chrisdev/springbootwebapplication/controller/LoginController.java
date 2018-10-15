package com.chrisdev.springbootwebapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String loginMessage(@RequestParam String name, @RequestParam Integer age, ModelMap model){
        model.put("name", name.toUpperCase());
        if (age != null)  model.put("age",age);
        return "login";}
}
