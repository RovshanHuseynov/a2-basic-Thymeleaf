package com.rh.sprin.a2basicthymeleaf.controller;

import com.rh.sprin.a2basicthymeleaf.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
    @RequestMapping("/begin")
    public String begin(){
        return "student-begin";
    }

    @GetMapping("/form")
    public String form(Model model){
        Student s = new Student();
        model.addAttribute("student", s);
        return "student-form";
    }

    @PostMapping("/confirm")
    public String confirm(@ModelAttribute("student") Student s){
        System.out.println("aaaa " + s);
        return "student-confirmation";
    }
}
