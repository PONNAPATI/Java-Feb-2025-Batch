package tharun.exceptionhandling;

public class Throw {
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
         public static void checkAge (int age){
             if(age > 18){
                 throw new IllegalArgumentException("You must be at least 18 years old.");
             }
             else {
                 System.out.println("You are allowed.");
             }
        }
}



/* Syntax for throw keyword

  throw new ExceptionType("Error message")

 */