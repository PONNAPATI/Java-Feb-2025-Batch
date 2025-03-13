package src.lurdhu.staticvariables;

public class Student {
    static String schoolName = "ABC Internation";
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

   public void display() {
       System.out.println(name + " with age " + age + " studies at :" + schoolName);
    }
}
