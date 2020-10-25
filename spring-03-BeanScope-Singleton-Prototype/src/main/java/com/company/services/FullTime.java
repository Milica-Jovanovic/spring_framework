package com.company.services;

import com.company.interfaces.Hours;
import lombok.Data;


public class FullTime implements Hours {



    public void getHours() {
        System.out.println("Weekly Teaching Hours : 20");
    }

}
