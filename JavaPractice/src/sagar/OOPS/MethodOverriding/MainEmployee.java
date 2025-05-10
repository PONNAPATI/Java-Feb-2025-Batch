<<<<<<<< HEAD:JavaPractice/src/sagar/oop/MethodOverriding/Employee/MainEmployee.java
package oop.MethodOverriding.Employee;
========
package MethodOverriding;
>>>>>>>> parent of b269ff8 (Adding one more Practice example on MethodOverRiding.):JavaPractice/src/sagar/oop/MethodOverriding/MainEmployee.java

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
