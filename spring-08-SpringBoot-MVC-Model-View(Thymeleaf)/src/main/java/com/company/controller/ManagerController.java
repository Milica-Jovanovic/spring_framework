package com.company.controller;

import com.company.enums.Gender;
import com.company.model.Manager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/manager")
public class ManagerController {

    @GetMapping("/list")
    public String showTable(Model model) {

        List<Manager> managerList = new ArrayList<>();
        managerList.add(new Manager("Milica", "Jovanovic", 30, Gender.FEMALE));
        managerList.add(new Manager("Millie", "Milly",30, Gender.FEMALE));
        managerList.add(new Manager("Thomas", "Jefferson", 50, Gender.MALE));

        model.addAttribute("managers", managerList);

        return "manager/manager-list";

    }
}
