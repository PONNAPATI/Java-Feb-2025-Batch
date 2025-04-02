package src.lurdhu.multithreading;

import java.util.Date;

public class MainThread {
    public static void main(String[] args) {  // main is a thread in java.
        System.out.println("Hi there...");

        test();
        test();
        test();
        test();
        test();
    }  // main thread stops



    public static void test(){
        System.out.println("this is test method : " + new Date());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
