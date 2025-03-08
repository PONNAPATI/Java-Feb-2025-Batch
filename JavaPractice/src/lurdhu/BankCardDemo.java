package src.lurdhu;

import java.util.Date;

public class BankCardDemo {
    public static void main(String[] args) {
        BankCard bankCard = new BankCard();

        // setting values to variables
        bankCard.balance = 1000;
        bankCard.cardNumber = 1001;
        bankCard.cardType = "VISA";
        bankCard.expiryDate = new Date();
        bankCard.name = "ICICI";

        // calling methods of the class
        bankCard.withdraw(200);

        double balanceOfCustomer = bankCard.balanceEnquiry();
        System.out.println("balance Of Customer : " + balanceOfCustomer);

        boolean isDepositSuccessful = bankCard.deposit(3000);
        if (isDepositSuccessful) {
            System.out.println("deposite is success");
        } else {
            System.out.println("deposite has failed");
        }

        double balanceOfCustomer1 = bankCard.balanceEnquiry();
        System.out.println("balance Of Customer : " + balanceOfCustomer1);


//        BankCard bankCard1 = new BankCard();
//        bankCard1.balance = 2000;
//        bankCard1.cardNumber = 1002;
//        bankCard1.cardType = "VISA";
//        bankCard1.expiryDate = new Date();
//        bankCard1.name = "ICICI";
//
//
//        BankCard bankCard2 = new BankCard();
//        bankCard2.balance = 5000;
//        bankCard2.cardNumber = 1003;
//        bankCard2.cardType = "VISA";
//        bankCard2.expiryDate = new Date();
//        bankCard2.name = "ICICI";

    }
}
