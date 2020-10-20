public class Employee {

    FullTimeEmployee fullTimeEmployee;
    PartTimeEmployee partTimeEmployee;
    //MI

    public Employee(FullTimeEmployee fullTimeEmployee, PartTimeEmployee partTimeEmployee) { //MI
        this.fullTimeEmployee = fullTimeEmployee;
        this.partTimeEmployee = partTimeEmployee;
    }

    public void manageAccount(){
        fullTimeEmployee.createAccount();
        partTimeEmployee.createAccount();
        //MI
    }
}
