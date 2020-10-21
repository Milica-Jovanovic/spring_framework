package com.company.services;

import com.company.interfaces.Hours;

public class PartTime implements Hours {

    @Override
    public void getHours() {
        System.out.println("Weekly Teaching Hours :  15");
    }
}
