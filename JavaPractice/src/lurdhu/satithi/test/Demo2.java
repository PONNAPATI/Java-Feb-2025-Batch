package src.lurdhu.satithi.test;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<Payment> payments = new ArrayList<>();

//        ArrayList payment1 = new ArrayList();

        CreditCardPayment cp = new CreditCardPayment();
        CashPayment cashp = new CashPayment();
        WalletPayment wp = new WalletPayment();


        payments.add(cp);
        payments.add(cashp);
        payments.add(wp);

        for(Payment paymnt : payments) {
            paymnt.pay();
            if(paymnt instanceof CashPayment){
                ((CashPayment)paymnt).test();
            }
        }


    }
}
