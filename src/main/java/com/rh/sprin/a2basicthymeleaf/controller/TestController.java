package com.rh.sprin.a2basicthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/showForm")
    public String show(){
        return "form2";
    }

    @RequestMapping("/processForm")
    public String process(){
        return "form3";
    }
}
