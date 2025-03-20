package src.lurdhu.comparableandcomparator;

import java.util.Comparator;

public class EmployeeAgeNameSort implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return (int) (emp1.getSalary() - emp2.getSalary());
    }
}
