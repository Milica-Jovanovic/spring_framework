package com.company.controller;

import org.springframework.web.bind.annotation.*;

import java.util.stream.Stream;

public class HomeController {

    @RequestMapping("/")
    public String getRequestMapping() {

        return "home";
    }

    @RequestMapping("/Milica")
    public String getRequestMapping2() {

        return "home";
    }

    @RequestMapping(method= RequestMethod.GET, value="/Milica")
    public String getRequestMapping3() {

        return "home";
    }

    @GetMapping ("/spring")
    public String getMappingExample() {

        return "home";
    }

    @PostMapping ("/spring")
    public String postMappingExample() {

        return "home";
    }

    @GetMapping ("/spring/{name}")
    public String pathVariableExample(@PathVariable("name")String name) {

        return "home";
    }


}
