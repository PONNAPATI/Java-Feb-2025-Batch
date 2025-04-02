package src.lurdhu.multithreading.synchronisation;

public class SynchronisationDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Thread t1 = new Thread(() -> bankAccount.withdraw(700));  // t1 thread is automated loan deduction thread
        Thread t2 = new Thread(() -> bankAccount.withdraw(700));  // t2 thread is customer withdrawing money from ATM

        t1.start();
        t2.start();
    }
}
