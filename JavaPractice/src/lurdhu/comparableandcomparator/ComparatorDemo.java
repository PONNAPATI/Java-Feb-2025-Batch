package src.lurdhu.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Employee e1 = new Employee();
        e1.setId(100);
        e1.setName("John");
        e1.setEmailId("john@gmail.com");
        e1.setSalary(5000);

        Employee e2 = new Employee();
        e2.setId(101);
        e2.setName("Thomas");
        e2.setEmailId("thomas@gmail.com");
        e2.setSalary(2000);

        Employee e3 = new Employee();

        e3.setId(102);
        e3.setName("Nikki");
        e3.setEmailId("nikki@gmail.com");
        e3.setSalary(8000);

        Employee e4 = new Employee();
        e4.setId(1003);
        e4.setName("Vlad");
        e4.setEmailId("vlad@gmail.com");
        e4.setSalary(5000);

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        System.out.println("---------------");
        System.out.println("employees before sorting : " + employees );

//        Collections.sort(employees, new EmployeeSalaryNameSort());


        Collections.sort(employees, new EmployeeSalarySort());

        System.out.println("---------------");
        System.out.println("employees after sorting : " + employees );
    }
}
