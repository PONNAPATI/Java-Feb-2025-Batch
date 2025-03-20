package src.lurdhu.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student s1 = new Student();
        s1.setId(100);
        s1.setName("John");
        s1.setEmailId("john@gmail.com");
        s1.setAge(25);

        Student s2 = new Student();
        s2.setId(101);
        s2.setName("Thomas");
        s2.setEmailId("thomas@gmail.com");
        s2.setAge(26);

        Student s3 = new Student();
        s3.setId(102);
        s3.setName("Nikki");
        s3.setEmailId("nikki@gmail.com");
        s3.setAge(24);

        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println("students before sorting : " + students );

        Collections.sort(students);

        System.out.println("students after sorting : " + students );
    }
}
