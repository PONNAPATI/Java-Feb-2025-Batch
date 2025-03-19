package tharun.staticmethod;

public class Student {
    static int totalStudent = 0;   // static variable
    String name;
    int age;

    Student(String name, int age ){
        this.name = name;
        this.age = age;
        totalStudent++;
    }
    public void displayStudentDetails() {
        System.out.println("name : " + name);
        System.out.println("age : " + age);
    }
    public static int getTotalStudents(){
        return totalStudent;
    }

    public static void main(String[] args) {
        Student student =  new Student("Prabhas", 35);
        student.displayStudentDetails();
        System.out.println("Total Students : " + student.getTotalStudents()); // using static method

        Student student2 = new Student("Nani", 22);
        student2.displayStudentDetails();
        System.out.println("Total Students: " + Student.getTotalStudents()); // Using static method

    }
}
