package src.lurdhu.abstraction;

import java.util.ArrayList;
import java.util.List;

public class AbstratctionDemo {
    public static void main(String[] args) {
//        CardPayment cardPayment = new CardPayment();
        Bank bank = new CardPayment();
        bank.pay();


        Bank bank1 = new CashPayment();
        bank1.pay();


//        CardPayment cardPayment = new CardPayment();
//        cardPayment.pay();

//        List<Integer> list = new ArrayList<>();
//        list.size();
    }
}
