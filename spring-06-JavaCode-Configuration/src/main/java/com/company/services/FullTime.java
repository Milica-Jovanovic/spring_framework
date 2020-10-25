package com.company.services;

import com.company.interfaces.Hours;
import com.company.interfaces.ExtraHours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;


public class FullTime implements Hours {

    private ExtraHours extraHours;


    public FullTime(ExtraHours extraHours) {
        this.extraHours= extraHours;
    }

    public void getHours() {
        System.out.println("Weekly hours: " + (30 + extraHours.getExtraHours()));
    }

    @Value("JD1")
    private String ID;
    @Value("${employee}")
    private String employee;
    @Value("${days}")
    private String[] days;

    @Override
    public String toString() {
        return "Java{" +
                "ID='" + ID + '\'' +
                ", employee='" + employee + '\'' +
                ", days=" + Arrays.toString(days) +
                '}';
    }
}