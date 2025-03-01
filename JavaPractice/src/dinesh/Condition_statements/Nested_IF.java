package dinesh.Condition_statements;

import java.util.Scanner;

public class Nested_IF {

    public static void main(String[] args) {
             /* If a number is even, we also need to check whether the number is divisible by 6.
                And if the number is odd, we need to check whether the number is divisible by 3.*/
        int Number = 57;
        //int Number_2 = 49367830;

        if(Number%2==0) {
            System.out.println("The number is Even ");
            if (Number % 6 == 0) {
                System.out.println("The number is divisible by 6");
            } else{
                System.out.println("The number is not divisible by 6");
            }
        }
        else {
            System.out.println("The number is odd ");
            if(Number%3==0){
                System.out.println("The number is divisible by 3");
            }
            else{
                System.out.println("The number is not divisible by 3");
            }
        }




        // Using Scanner input
        Scanner divisible = new Scanner(System.in);

        System.out.println("Number_2:");
        int Number_2 = divisible.nextInt();

        if(Number_2%2==0) {
            System.out.println("The number is Even ");
            if (Number_2 % 5 == 0) {
                System.out.println("The number is divisible by 5");
            } else{
                System.out.println("The number is not divisible by 5");
            }
        }
        else {
            System.out.println("The number is odd ");
            if(Number_2%6==0){
                System.out.println("The number is divisible by 6");
            }
            else{
                System.out.println("The number is not divisible by 6");
            }
        }
    }
}
