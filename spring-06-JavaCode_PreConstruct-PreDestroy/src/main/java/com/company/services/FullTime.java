package com.company.services;

import com.company.interfaces.Hours;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
public class FullTime implements Hours {



        @Override
        public void getHours() {
            System.out.println("Hours : 30");
        }

        @PostConstruct
        public void postConstruct(){
            System.out.println("Executing post construct");
        }

        @PreDestroy
        public void preDestroy(){
            System.out.println("Executing pre destroy");
        }
}
