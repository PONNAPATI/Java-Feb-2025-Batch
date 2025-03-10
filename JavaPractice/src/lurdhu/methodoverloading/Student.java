package src.lurdhu.methodoverloading;

public class Student {

    private int rollNumber;
    private String name;
    private int age;
    private long phoneNumber;

    Student(){
        System.out.println("This is default constructor");
    }

    Student(int rollNumber, String name){
        this.rollNumber = rollNumber;
        this.name = name;
        System.out.println("This is 2 parameters constructor");
    }

    Student(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
        System.out.println("This is 2 parameters constructor with different order of the parameters ");
    }

    Student(int rollNumber, String name, int age){
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        System.out.println("This is 3 parameters constructor");
    }

    public int add() {
        System.out.println("This is no arguments/parameters method");
        return 0;
    }

    public int add(int a , int b) {
        System.out.println("This is 2 arguments/parameters method of type int");
        return a+b;
    }

    public double add(double a , double b) {
        System.out.println("This is 2 arguments/parameters method of type double");
        return a+b;
    }

    public double add(double a , double b, int c) {
        System.out.println("This is 3 arguments/parameters method");
        return a+b+c;
    }

    public static void main(String[] args) {
        Student student = new Student("Arjun", 1001);
        student.add(5,6);
        student.add(5.0,7);
    }
}
