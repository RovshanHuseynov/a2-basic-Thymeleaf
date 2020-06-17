package com.rh.sprin.a2basicthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String aaa(Model model){
        model.addAttribute("theDate", new java.util.Date());
        return "helloworld";
    }
}
