package src.lurdhu.multithreading.synchronisation;

public class BankAccount {
    private int balance = 1000;

    synchronized public void withdraw(int withdrawalAmount) {
        if(balance >= withdrawalAmount){
            System.out.println("Thread name :" + Thread.currentThread().getName() + " is withdrawing");
            balance = balance - withdrawalAmount;
            System.out.println("Remaining balance is : " + balance + " for thread :" + Thread.currentThread().getName());
        }else{
            System.out.println("Insufficient funds in your account");
        }
    }
}
