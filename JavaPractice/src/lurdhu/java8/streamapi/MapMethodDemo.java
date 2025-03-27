package src.lurdhu.java8.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethodDemo {
    public static void main(String[] args) {

//        List<String> names = Arrays.asList("John", "Thomas", "Nikki");
//
//
//        List<String> upperCaseNames = names.stream()
//                .map(name -> name.toUpperCase())
//                .collect(Collectors.toList());
//
//        System.out.println(upperCaseNames);


        List<Student> students = new ArrayList<>();

        Student student1 = new Student(1001, "John", "john@gmail.com");
        Student student2 = new Student(1002, "Thomas", "thomas@gmail.com");
        Student student3 = new Student(1003, "Nikki", "nikki@gmail.com");

        students.add(student1);
        students.add(student2);
        students.add(student3);

        List<String> studentEmails = students.stream()
                .map(std -> std.getEmail())
                .collect(Collectors.toList());

        System.out.println(studentEmails);

    }
}
