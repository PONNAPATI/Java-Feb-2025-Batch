import java.util.*;
class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class hashCode {



        public static void main(String[] args) {
            Student s1 = new Student("Alice", 20);
            Student s2 = new Student("Alice", 20);

            System.out.println(s1.hashCode()); // Different number
            System.out.println(s2.hashCode()); // Different number

    }
}
