package com.chrisdev.springbootwebapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChartController {

    @RequestMapping("/chart")
    public String displayChart(@RequestParam String property, ModelMap model){
        model.put("property", property);
        return "chart";}
    }

