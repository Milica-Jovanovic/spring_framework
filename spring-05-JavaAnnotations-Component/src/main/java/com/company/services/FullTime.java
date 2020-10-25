package com.company.services;

import com.company.interfaces.Hours;
import org.springframework.stereotype.Component;

@Component
public class FullTime implements Hours {

    @Override
    public void getHours() {
        System.out.println("Weekly hours : 30");
    }
}
