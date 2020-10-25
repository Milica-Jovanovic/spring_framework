package com.company.services;

import com.company.interfaces.Hours;


public class FullTime implements Hours {

    @Override
    public void getHours() {
        System.out.println("Weekly Teaching Hours : 20");
    }


    public void myInitMethod() {
        System.out.println("Executing init method");
    }

    public void myDestroyMethod() {
        System.out.println("Executing destroy method");
    }

}
