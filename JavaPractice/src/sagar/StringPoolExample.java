public class StringPoolExample {
    public static void main(String[]args){

        // Assigning Grades to students

        String Student1 = "A";
        String Student2 ="A"; //  Same String, should use String pool
        String Student3 = new String("A"); // creates a new object in heap

        //Checking is Student1 and student2 refer to the same object
        System.out.println("Student1 == Student2: " + (Student1 == Student2));

        //Checking is Student1 and student3 refer to the same object
        System.out.println("Student1 == Student3: " + (Student1 == Student3));

        // Checking if the content is the same
        System.out.println("Student1.equals(Student3): " + Student1.equals(Student3));
    }
}

/*

== compares memory location, so:
student1 == student2 → true (same reference in String Pool)
student1 == student3 → false (different objects)
        .equals() compares actual content, so:
        student1Grade.equals(student3) → true (same content)
==========
        */
