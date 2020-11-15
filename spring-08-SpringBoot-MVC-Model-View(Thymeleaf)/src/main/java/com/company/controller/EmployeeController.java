package com.company.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/welcome")
    public String homepage(Model model) {


        // String name = "Milica";

        model.addAttribute("name", "Milica");
        model.addAttribute("job", "Full Stack Java Developer");

        String subject = "Collections";
        model.addAttribute("subject", subject);


        return "employee/welcome";
    }

}
