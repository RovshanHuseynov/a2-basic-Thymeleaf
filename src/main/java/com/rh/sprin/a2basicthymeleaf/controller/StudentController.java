package com.rh.sprin.a2basicthymeleaf.controller;

import com.rh.sprin.a2basicthymeleaf.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
    @RequestMapping("/begin")
    public String begin(){
        return "student-begin";
    }

    @RequestMapping("/form")
    public String form(Model model){
        Student s = new Student();
        model.addAttribute("student", s);
        return "student-form";
    }

    @RequestMapping("/confirm")
    public String confirm(){
        return "student-confirmation";
    }
}
