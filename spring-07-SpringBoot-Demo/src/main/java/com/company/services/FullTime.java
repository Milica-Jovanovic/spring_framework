package com.company.services;

import com.company.interfaces.ExtraHours;
import com.company.interfaces.Hours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FullTime implements Hours {

    @Value("${employee}")
    private String instructorName;

    private ExtraHours extraHours;

    @Autowired
    public FullTime(ExtraHours extraHours) {
        this.extraHours = extraHours;
    }

    @Override
    public int getHours() {
        return 20 + extraHours.getExtraHours();
    }
}
