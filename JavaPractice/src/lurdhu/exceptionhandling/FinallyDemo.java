package src.lurdhu.exceptionhandling;

import java.io.IOException;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            // open database connection
            // perform database operations
            int result = 10/0;

        } catch (Exception e) {
            System.out.println("This is catch block....");
        } finally {
            // close the connection.
            System.out.println("This is finally block....");
        }


        try {
            int result = 10/0;

        } catch (Exception e) {
            System.out.println("This is catch block....");
        }

        try {
            // open database connection
            // perform database operations
            int result = 10/0;

        } catch (Exception e) {
            System.out.println("This is catch block....");
        } finally {
            // close the connection.
            System.out.println("This is finally block....");
        }
    }
}
