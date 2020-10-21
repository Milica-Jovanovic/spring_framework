package com.company;

import com.company.interfaces.Hours;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompanyApp {

    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Hours hours = container.getBean("java", Hours.class);

        hours.getHours();


    }
}
