package oop.MethodOverriding.Employee;

public class MainEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Sagar");
        Employee e2 = new Developer("Vijay");
        Employee e3 = new Manager("Lourdu");

        e1.work();
        e2.work();
        e3.work();
    }
}
