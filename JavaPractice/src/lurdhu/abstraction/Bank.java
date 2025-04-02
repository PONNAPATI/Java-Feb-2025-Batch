package src.lurdhu.abstraction;

public interface Bank {
    void pay();

    void checkBalance();

    default void printReceipt() {
        System.out.println("This is common functionality");
    }
}
