package src.lurdhu.comparableandcomparator;

import java.util.Comparator;

public class EmployeeSalarySort implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        // Compare by salary (descending)
        return Double.compare(emp1.getSalary(), emp2.getSalary());
    }
}
