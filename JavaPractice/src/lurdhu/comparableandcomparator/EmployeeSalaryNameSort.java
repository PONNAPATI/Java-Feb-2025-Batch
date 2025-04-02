package src.lurdhu.comparableandcomparator;

import java.util.Comparator;

public class EmployeeSalaryNameSort implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        // Compare by salary (descending)
        int salaryCompare = Double.compare(emp1.getSalary(), emp2.getSalary());

        // If salaries are equal, compare by name (ascending)
        if (salaryCompare == 0) {
            return emp1.getName().compareTo(emp2.getName());
        }

        return salaryCompare;
    }
}
