package com.company.services;

import com.company.interfaces.ExtraHours;
import com.company.interfaces.Hours;

public class FullTime implements Hours {

    private OverTime overTime;

    public  OverTime getExtraHours() {
        return overTime;
    }


    public void getHours() {
        System.out.println("Weekly Teaching Hours : " + (20 + overTime.getExtraHours()));
    }

}
