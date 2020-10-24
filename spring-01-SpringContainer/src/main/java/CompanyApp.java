import interfaces.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CompanyApp {

    public static void main(String[] args) {


        BeanFactory container1 = new ClassPathXmlApplicationContext("config.xml");

        Employee employee1 = (Employee) container1.getBean("fullTimeEmployee");

        employee1.createAccount();



        ApplicationContext container2 = new ClassPathXmlApplicationContext("config.xml");

        Employee employee2 = (Employee) container1.getBean("fullTimeEmployee");

        employee2.createAccount();


    }
}
