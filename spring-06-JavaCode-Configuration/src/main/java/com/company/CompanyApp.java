package com.company;

import com.company.configs.CompanyAppConfig;
import com.company.interfaces.Hours;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CompanyApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(CompanyAppConfig.class);

        Hours hours = container.getBean("fullTime",Hours.class);

        System.out.println(hours.toString());

        hours.getHours();




    }
}
