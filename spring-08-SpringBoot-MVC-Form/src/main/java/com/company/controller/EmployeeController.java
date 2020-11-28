package com.company.controller;


import com.company.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("register")
    public String showForm(Model model) {

        model.addAttribute("employee", new Employee());

        List<String> titleList = Arrays.asList("Front End Developer", "Back End Developer", "Full Stack Developer");
        model.addAttribute("titleList", titleList);


        return "employee/employee-register";
    }

    @PostMapping("/confirm")
    public String submitForm(@ModelAttribute("employee") Employee employee) {
        System.out.println(employee.toString());
        return "employee/employee-confirmation";
    }


}
