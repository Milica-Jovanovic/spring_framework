package com.company.services;

import com.company.interfaces.ExtraHours;

public class OverTime implements ExtraHours {

    @Override
    public int getExtraHours() {
        return 5;
    }
}
