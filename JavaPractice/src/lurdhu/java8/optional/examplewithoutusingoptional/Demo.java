package src.lurdhu.java8.optional.examplewithoutusingoptional;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        // --------------------------------------
        Student student1 = new Student(100, "John", "john@gmail.com", null);
        Student student2 = new Student(101, "Thomas", "thomas@gmail.com",
                new Address("xyz", 254, "5100C7"));

        Student student3 = new Student(102, "Nikki", "nikki@gmail.com",
                new Address("xyz", 255, "5100C7"));


        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        //--------------------------------------

        studentList.stream()
                .map(std -> std.getAddress().map(adr -> adr.getPincode()).orElse("5100C8"))
                .forEach(System.out::println);
    }
}
