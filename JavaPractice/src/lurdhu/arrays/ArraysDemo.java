package src.lurdhu.arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        String[] studentNames; // Declaration
        studentNames = new String[5]; // Initialise
//        String[] studentNames = {"Sagar", "Sahithi", "Deepthi", "Shiva", "Rohit"};

        // Add elements to the array
        studentNames[0] = "Sagar";
        studentNames[1] = "Sahithi";
        studentNames[2] = "Deepthi";
        studentNames[3] = "Shiva";
        studentNames[4] = "Rohit";
        //studentNames[5] = "Dinesh";  // ArrayIndexOutOfBoundsException

        for(String studentNameDetails:studentNames){
            System.out.println("student name is = " + studentNameDetails);
        }

        studentNames[0] = "Tharun";  // Updating one element

        System.out.println("Array elements after updating the one index");

        for(String studentNameDetails:studentNames){
            System.out.println("student name is = " + studentNameDetails);
        }

        System.out.println(studentNames[3]);  // Accessing an element

    }
}
