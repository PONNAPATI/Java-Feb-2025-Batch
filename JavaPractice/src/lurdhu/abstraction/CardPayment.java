package src.lurdhu.abstraction;

public class CardPayment implements Bank{
    @Override
    public void pay() {
        System.out.println("This is card payment");
    }

    @Override
    public void checkBalance() {
        System.out.println("checking card balance");
    }
}
