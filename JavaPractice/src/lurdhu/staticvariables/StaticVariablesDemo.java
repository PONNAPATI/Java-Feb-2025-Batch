package src.lurdhu.staticvariables;

public class StaticVariablesDemo {
    public static void main(String[] args) {
        Student s1 = new Student("John", 25);
        Student s2 = new Student("Michael", 24);

        s1.display();
        s2.display();

        Student.schoolName = "ABC Global";

        System.out.println("......After changing school name.....");
        s1.display();
        s2.display();
    }
}
