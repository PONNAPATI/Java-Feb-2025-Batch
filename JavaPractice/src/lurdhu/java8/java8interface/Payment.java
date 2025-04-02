package src.lurdhu.java8.java8interface;

public interface Payment {
    void pay();

    default void deposit(double amount) {
        // deduct the amount from customer's account and deposit the amount into the bank's account
        // 100 lines of code
    }

    static void getBalance() {
        System.out.println("Getting balance of the customer");
    }
}
