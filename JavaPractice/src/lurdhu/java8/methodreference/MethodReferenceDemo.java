package src.lurdhu.java8.methodreference;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceDemo {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student student1 = new Student(1003, "John", "john@gmail.com");
        Student student2 = new Student(1005, "Thomas", "thomas@gmail.com");
        Student student3 = new Student(1001, "Nikki", "nikki@gmail.com");

        students.add(student1);
        students.add(student2);
        students.add(student3);


        System.out.println(students);

        StudentIdSort studentIdSort = new StudentIdSort();
        Collections.sort(students, studentIdSort::compare);

        System.out.println("students after sorting");
        System.out.println(students);

    }
}
