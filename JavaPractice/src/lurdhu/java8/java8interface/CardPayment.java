package src.lurdhu.java8.java8interface;

public class CardPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("This is CardPayment");
        deposit(3000);

        Payment.getBalance();
    }


}
