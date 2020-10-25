package com.company.services;

import com.company.interfaces.ExtraHours;
import com.company.interfaces.Hours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FullTime implements Hours {

    //@Autowired
    //@Qualifier("overTime")
    private ExtraHours extraHours;

    public FullTime(@Qualifier("overTime") ExtraHours extraHours) {
        this.extraHours = extraHours;
    }

    @Override
    public void getHours() {

        System.out.println("Weekly hours : " + (20 + extraHours.getExtraHours()) );
    }


}
