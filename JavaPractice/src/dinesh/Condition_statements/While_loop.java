package dinesh.Condition_statements;

import java.util.Scanner;

public class While_loop {
    public static void main(String[] args) {
        // Sum of all digits in variable
        int ID =  343672;
        int sum = 0;

        while(ID>0){
            sum += ID%10;
            ID /= 10;
        }
        System.out.println("The Sum of digits is: " +sum+"/n");




        // Reverse of a Number
        //For example, if the input is 12345, the output should be 54321

        //int rev = 3678298;
        //int reversed_number = 0;

        Scanner Reversed_number = new Scanner(System.in);

        //System.out.println("The number to be reversed is: ");
        //int  Reverse = Reversed_number.nextInt();

        System.out.println("The number to be reversing is: ");
        int Reversing = Reversed_number.nextInt();
        int Reversed = 0;

       // double

        while(Reversing != 0){

           Reversed = Reversed * 10 +   Reversing % 10;

            Reversing /= 10;
        }
        System.out.println("The reversed Number is: " +Reversed+"\n");




        //Calculating the Sum of Numbers from 1 to 10 with Java while Loop

        //int A = 1;
        int add = 0;

        Scanner Adding = new Scanner(System.in);

        System.out.println("The Natural needed to be added: ");
        int Sum = Adding.nextInt();

        while(Sum<=10){
            add = add + Sum;
            Sum ++;
        }
        System.out.println("The Sum of 1 to 10 natural number is:" +add+"\n");



        Scanner bank = new Scanner(System.in);
        System.out.println("The balance before withdrawal ");
        double balance = bank.nextDouble();

        while(balance>0) {
            System.out.println("Your balance is: " + balance);

            System.out.println("Enter the amount to be withdraw: ");
            double withdraw = bank.nextDouble();

            if (withdraw > balance) {
                System.out.println("Not have Sufficient balance to withdraw the amount: " + withdraw);
            } else {
                balance -= withdraw;
                System.out.println("With Success and take the bills " + "\n");
            }

        }
            System.out.println("You ran out of balance");
            //bank.close();


    }
}



