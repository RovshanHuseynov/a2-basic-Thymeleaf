package com.rh.sprin.a2basicthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/showForm")
    public String show(){
        return "form2";
    }

    @RequestMapping("/processForm")
    public String process(Model model) {
        model.addAttribute("studentName", "aaaaa");
        return "form3";
    }

    @RequestMapping("/begin")
    public String begin(){
        return "form1";
    }
}
