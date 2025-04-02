package src.lurdhu.java8.functinalinterface;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class RunnableFunctionalInterfaceDemo {
    public static void main(String[] args) {
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("This is run method");
//            }
//        };

        Runnable runnable = () -> {
            System.out.println("This is run method");
        };

        Callable clb = () -> {
            return 5+6;
        };

        runnable.run();
        try {
            int result = (Integer) clb.call();
            System.out.println("callable interface method output : " + result);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
