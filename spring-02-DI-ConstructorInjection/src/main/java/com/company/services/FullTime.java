package com.company.services;

import com.company.interfaces.ExtraHours;
import com.company.interfaces.Hours;

public class FullTime implements Hours {

    ExtraHours extraHours;

    public FullTime(ExtraHours extraHours) {
        this.extraHours = extraHours;
    }

    @Override
    public void getHours() {
        System.out.println("Weekly Teaching Hours : " + (20 + extraHours.getExtraHours()));
    }

}
