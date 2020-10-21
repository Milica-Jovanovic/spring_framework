package service;

import implementation.Employee;

public class FullTimeEmployee implements Employee {

    @Override
    public void createAccount() {
        System.out.println("Full Time Employee Account is created...");
    }
}
