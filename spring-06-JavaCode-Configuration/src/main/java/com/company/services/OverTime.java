package com.company.services;

import com.company.interfaces.ExtraHours;
import org.springframework.stereotype.Component;


public class OverTime implements ExtraHours {

    @Override
    public int getExtraHours() {
        return 7;
    }
}