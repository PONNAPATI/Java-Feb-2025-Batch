package src.lurdhu.java8.java8interface;

public class WalletPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("This is WalletPayment...");
        deposit(5000);

        Payment.getBalance();
    }
}
