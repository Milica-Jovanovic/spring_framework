package com.company.controller;


import com.company.datagenerator.DataGenerator;
import com.company.model.Manager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.Arrays;

@Controller
@RequestMapping("/manager")
public class ManagerController {


    @GetMapping("/register")
    public String managerCreate(Model model){

        model.addAttribute("manager",new Manager());
        model.addAttribute("stateList", DataGenerator.getStateList());
        return "manager/manager-create";
    }

    @PostMapping("/list")
    public String managerList(@ModelAttribute("manager") Manager manager, Model model){

        model.addAttribute("managerList", Arrays.asList(manager));

        int birthYear = LocalDate.parse(manager.getBirthday()).getYear();
        model.addAttribute("age",LocalDate.now().getYear() - birthYear);

        return "manager/manager-list";
    }

}
