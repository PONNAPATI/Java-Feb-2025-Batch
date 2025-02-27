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
student1Grade == student2Grade → true (same reference in String Pool)
student1Grade == student3Grade → false (different objects)
        .equals() compares actual content, so:
        student1Grade.equals(student3Grade) → true (same content)

        */
