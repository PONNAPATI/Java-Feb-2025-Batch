package src.lurdhu.satithi.test;

public class WalletPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("This is wallet payment");
    }
}
