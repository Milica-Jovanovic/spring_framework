package com.company;

import com.company.interfaces.Hours;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompanyApp {

    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Hours hours1 = container.getBean("fullTime", Hours.class);

        Hours hours2 = container.getBean("fullTime", Hours.class);

        System.out.println("Pointing to the same object: "+ (hours1 == hours2));

        System.out.println("Memory Location for the hours1: " + hours1);

        System.out.println("Memory Location for the hours2: " + hours2);


    }
}
