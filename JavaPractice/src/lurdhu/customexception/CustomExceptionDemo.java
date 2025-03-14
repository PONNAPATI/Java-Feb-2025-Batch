package src.lurdhu.customexception;

public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            vote(15);
        } catch (InvalidAgeException e) {
            System.out.println("Exception occurred during vote : " + e.getMessage());
        }
    }

    public static void vote(int age) throws InvalidAgeException {
        if(age < 18){
            throw new InvalidAgeException("Age should be 18 or more inorder to vote");
        }
    }
}
