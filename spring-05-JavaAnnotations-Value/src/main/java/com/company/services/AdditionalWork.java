package com.company.services;

import com.company.interfaces.ExtraHours;
import org.springframework.stereotype.Component;

@Component
public class AdditionalWork implements ExtraHours {
    @Override
    public int getExtraHours() {

        return 9;
    }
}
