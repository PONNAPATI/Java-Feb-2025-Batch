package src.lurdhu.java8.methodreference;

import src.lurdhu.comparableandcomparator.Employee;

import java.util.Comparator;

public class StudentIdSort implements Comparator<Student> {
    @Override
    public int compare(Student std1, Student std2) {
        return Integer.compare(std1.getId(), std2.getId());
    }

}
