package src.lurdhu;

import java.util.Date;

public class BankCard {
    public String name;
    public int cardNumber;
    public String cardType;
    public Date expiryDate;
    public double balance;


    public void withdraw(double amount){
        System.out.println("Withdrawing amount : " + amount);
        double remainingAmount = balance - amount;   //balance = balance - amount;
        balance = remainingAmount;
    }

    public double balanceEnquiry(){
        System.out.println("Enquiring balance.....");
        return balance;
    }

    public boolean deposit(double amount){
        System.out.println("Depositing amount : " + amount);
        double newBalance = balance + amount;
        balance = newBalance;
        return true;
    }
}
