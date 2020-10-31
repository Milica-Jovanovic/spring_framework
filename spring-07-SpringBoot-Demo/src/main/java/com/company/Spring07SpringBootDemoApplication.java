package com.company;

import com.company.interfaces.Hours;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring07SpringBootDemoApplication {

	public static void main(String[] args) {

			ApplicationContext container = SpringApplication.run(Spring07SpringBootDemoApplication.class, args);

			Hours hours = container.getBean("fullTime", Hours.class);

			System.out.println(hours.getHours());



	}
}
