package tharun.exceptionhandling;

public class CustomException {
    public static void main(String[] args) {

        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("catch error :" + e.getMessage());
        }
    }
    public static void checkAge(int age) throws InvalidAgeException {
        if (age <= 18) {
            throw new InvalidAgeException(" age must be atleast 18 above");
        } else {
            System.out.println(" age is valid");
        }
    }
}


/* SYNTAX FOR CUSTOM EXCEPTION

  Class myCustomException extends Exception{
        public myCustomException(String message){
        super(message);
 */
