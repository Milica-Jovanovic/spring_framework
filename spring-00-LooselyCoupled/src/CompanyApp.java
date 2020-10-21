import implementation.Employee;
import service.EmployeeAccount;
import service.FullTimeEmployee;
import service.PartTimeEmployee;

public class CompanyApp {

    public static void main(String[] args) {

       // FullTimeEmployee fullTime = new FullTimeEmployee();

        PartTimeEmployee partTime = new PartTimeEmployee();

        EmployeeAccount employee = new EmployeeAccount(partTime);

        employee.manageAccount();

    }
}
