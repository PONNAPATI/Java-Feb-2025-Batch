package src.lurdhu.abstraction;

public class WalletPayment implements Bank{
    @Override
    public void pay() {
        System.out.println("This is Wallet Payment");
    }

    @Override
    public void checkBalance() {
        System.out.println("This is wallet balance.");
    }
}
