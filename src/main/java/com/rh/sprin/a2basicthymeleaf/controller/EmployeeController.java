package com.rh.sprin.a2basicthymeleaf.controller;

import com.rh.sprin.a2basicthymeleaf.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    private List<Employee> employees;

    public EmployeeController() {
        Employee e1 = new Employee(1, "Rovshan", "Rovshan");
        Employee e2= new Employee(2, "Eli", "Eli");
        Employee e3 = new Employee(3, "Semed", "Semed");
        Employee e4 = new Employee(4, "Natiq", "Natiq");

        employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
    }

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("employees", employees);
        return "employees";
    }
}
