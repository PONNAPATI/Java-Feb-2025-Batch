package AllPracticeFiles;

public class EligibilityCheck {
    public static void main(String[]args){
        int age = 18;

        //Check voting eligibility
        if ( age >=18) {
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }

        // Check driving eligibility

        if ( age <=17) {
            System.out.println("You are eligible to drive");
        }else {
            System.out.println("You are not eligible to drive");
        }
    }

}
