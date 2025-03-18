package src.lurdhu.satithi.test;

public class CreditCardPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Doing credit card payment");
    }
}
