package service;

import implementation.Employee;

public class EmployeeAccount {

    Employee employee;

    public EmployeeAccount(Employee employee) {
        this.employee = employee;
    }
    // command + N is used for shortcut to create constructor


    public void manageAccount () {
        this.employee.createAccount();
    }
}
