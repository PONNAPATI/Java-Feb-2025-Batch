package src.lurdhu;

import java.util.Scanner;

public class WhileLoopWithBankBalanceDemo {
    public static void main(String[] args) {
        int balance = 1000;
        Scanner scannerInstance = new Scanner(System.in);

        while(balance > 0) {
            System.out.println("Your balance is :" + balance);
            System.out.println("Please enter amount to withdraw..");

            int withdrawalAmount = scannerInstance.nextInt();

            if (withdrawalAmount > balance) {
                System.out.println("Hey... You dont have sufficient balance in your account");
            } else {
                balance = balance - withdrawalAmount;
                System.out.println("Withdrawal is successful");
            }

        }

        System.out.println("Your current balance is  : " + balance);
        scannerInstance.close();
    }
}
