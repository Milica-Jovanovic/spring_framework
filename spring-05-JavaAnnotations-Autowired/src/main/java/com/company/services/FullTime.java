package com.company.services;

import com.company.interfaces.ExtraHours;
import com.company.interfaces.Hours;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FullTime implements Hours {


    @Autowired
    private OverTime overTime;
/*
    //Constructor Injection
    @Autowired
    public FullTime(OverTime overTime) {
        this.overTime = overTime;
    }
 */

    public OverTime getOverTime() {
        return overTime;
    }
/*
    //Setter Injection
    @Autowired
    public void setOverTime(OverTime overTime) {
        this.overTime = overTime;
    }
 */

    @Override
    public void getHours() {
        System.out.println("Weekly teaching hours :" + (30 + overTime.getExtraHours()));
    }
}
