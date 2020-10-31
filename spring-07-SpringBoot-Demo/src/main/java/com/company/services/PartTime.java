package com.company.services;

import com.company.interfaces.Hours;
import org.springframework.stereotype.Component;

@Component
public class PartTime implements Hours {
    public int getHours() {
        return 10;
    }
}
