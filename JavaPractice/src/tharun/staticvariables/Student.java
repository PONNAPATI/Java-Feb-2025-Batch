package tharun.staticvariables;

public class Student {
    static int totalStudents = 0;

    Student() {
        totalStudents++;
    }
    public  void display(){
        System.out.println("Total Students : " + totalStudents);
    }


    public static void main(String[] args) {
        Student student = new Student();
        student.display();

        Student student2 = new Student();
        student2.display();

//        Student.display();
//        System.out.println(Student.totalStudents);
    }
}
