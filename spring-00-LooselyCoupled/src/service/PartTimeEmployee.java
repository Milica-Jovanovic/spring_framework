package service;

import implementation.Employee;

public class PartTimeEmployee implements Employee {

    @Override
    public void createAccount() {
        System.out.println("Part Time Employee Account is created...");
    }
}
