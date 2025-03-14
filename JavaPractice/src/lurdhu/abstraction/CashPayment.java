package src.lurdhu.abstraction;

public class CashPayment implements Bank{
    @Override
    public void pay() {
        System.out.println("This is cash payment");
    }

    @Override
    public void checkBalance() {
        System.out.println("This is cash balance");
    }
}
