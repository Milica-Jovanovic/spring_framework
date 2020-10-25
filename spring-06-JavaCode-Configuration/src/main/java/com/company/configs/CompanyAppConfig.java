package com.company.configs;

import com.company.interfaces.ExtraHours;
import com.company.services.FullTime;
import com.company.services.OverTime;
import com.company.services.PartTime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.company")
@PropertySource("classpath:application.properties")
public class CompanyAppConfig {

    @Bean
    public FullTime fullTime(){
        return new FullTime(extraHours());
    }

    @Bean
    public PartTime partTime(){
        return new PartTime();
    }
/*
    //@Bean
    public OverTime overTime(){
        return new OverTime();
    }
 */

    //@Bean
    public ExtraHours extraHours(){
        return new OverTime();
    }



}