package com.company.services;

import com.company.interfaces.ExtraHours;
import com.company.interfaces.Hours;
import lombok.Data;

@Data
public class FullTime implements Hours {


    private ExtraHours extraHours;
    //private OverTime overTime;

// command + N and choose getter and setter
/*    public OverTime getOverTime() {
        return overTime;
    }

    public void setOverTime(OverTime overTime) {
        this.overTime = overTime;
    }
*/
    public void getHours() {
        System.out.println("Weekly Teaching Hours : " + (20 + extraHours.getExtraHours()));
    }

}
