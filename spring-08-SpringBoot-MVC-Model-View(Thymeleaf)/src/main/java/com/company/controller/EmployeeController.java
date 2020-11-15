package com.company.controller;


import com.company.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/welcome")
    public String homePage(Model model) {


        // String name = "Milica";

        model.addAttribute("name", "Milica");
        model.addAttribute("job", "Full Stack Java Developer");

        String subject = "Collections";
        model.addAttribute("subject", subject);

        // Creating some random employeeID (0 - 1000) and showing it in our UI
        int employeeID = new Random().nextInt(1000);
        model.addAttribute("id", employeeID);


        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(9);
        model.addAttribute("numbers", numbers);


        //print birthday
        LocalDate birthday = LocalDate.now().minusYears(30).minusMonths(4).minusDays(11);
        model.addAttribute("birthday", birthday);

        Employee employee = new Employee(1, "Milica", "Jovanovic" );
        model.addAttribute("employee", employee);

        return "employee/welcome";
    }




    @GetMapping("/register")
    public String homePage2(Model model) {

        return "employee/register";
    }


}
