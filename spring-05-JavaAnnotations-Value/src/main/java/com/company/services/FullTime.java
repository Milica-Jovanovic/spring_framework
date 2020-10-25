package com.company.services;

import com.company.interfaces.ExtraHours;
import com.company.interfaces.Hours;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class FullTime implements Hours {

    @Value("JD1")
    private String ID;

    @Value("${employee}")
    private String employee;

    @Value("${days}")
    private String[] days;


    @Override
    public String toString() {
        return "FullTime{" +
                "ID='" + ID + '\'' +
                ", employee='" + employee + '\'' +
                ", days=" + Arrays.toString(days) +
                '}';
    }

    //@Autowired
    //@Qualifier("officeHours")
    private ExtraHours extraHours;

    public FullTime(@Qualifier("overTime") ExtraHours extraHours) {
        this.extraHours = extraHours;
    }

    @Override
    public void getHours() {
        System.out.println("Weekly hours : " + (20 + extraHours.getExtraHours()));
    }


}
