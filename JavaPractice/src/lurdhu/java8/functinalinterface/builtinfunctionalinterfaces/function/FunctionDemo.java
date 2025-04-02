package src.lurdhu.java8.functinalinterface.builtinfunctionalinterfaces.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student student1 = new Student(1001, "John", "john@gmail.com");
        Student student2 = new Student(1002, "Thomas", "thomas@gmail.com");
        Student student3 = new Student(1003, "Nikki", "nikki@gmail.com");

        students.add(student1);
        students.add(student2);
        students.add(student3);

        Function<Student, String> getEmailId = std-> std.getEmailId();

        List<String> emailIds = students.stream()
                .map(getEmailId)
                .collect(Collectors.toList());

        System.out.println(emailIds);

    }
}
