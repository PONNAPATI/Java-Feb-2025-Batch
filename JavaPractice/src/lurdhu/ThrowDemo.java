package src.lurdhu;

public class ThrowDemo {
    public static void main(String[] args) {

        try {
            vote(15);
        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
        }
    }

    public static void vote(int age) {
        if(age < 18){
            throw new IllegalArgumentException("Age must be 18 or above in order to vote");
        }

        System.out.println("You can vote..");
    }
}
