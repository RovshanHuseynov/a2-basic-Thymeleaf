package com.rh.sprin.a2basicthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
    @RequestMapping("/begin")
    public String begin(){
        return "form1";
    }

    @RequestMapping("/showForm")
    public String show(){
        return "form2";
    }

    @RequestMapping("/processForm")
    public String process(@RequestParam("studentName") String s, Model model){
        model.addAttribute("studentName", s.toUpperCase());
        return "form3";
    }
}
