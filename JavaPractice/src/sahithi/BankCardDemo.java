package src.sahithi;

import src.lurdhu.BankCard;

public class BankCardDemo {
    public static void main(String[] args) {
        BankCard bankCard = new BankCard();

        // setting values to variables
        bankCard.balance = 5000;

        // calling methods of the class
        double customerBalance = bankCard.balanceEnquiry();
        System.out.println("customer balance is : "  + customerBalance);

    }
}
