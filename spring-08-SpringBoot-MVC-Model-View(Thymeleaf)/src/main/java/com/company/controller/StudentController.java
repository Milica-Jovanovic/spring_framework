package com.company.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/welcome")
    public String homepage(Model model) {


        // String name = "Milica";

        model.addAttribute("name", "Milica");


        return "student/welcome";
    }

}
