package src.lurdhu.multithreading;

import java.util.Date;

public class Student implements Runnable{
    @Override
    public void run() {
//        for(int i = 0; i < 5; i++){
//            System.out.println("Thread : " + Thread.currentThread().getName() + "-" + i + ", Time : " + new Date());
           System.out.println("Thread : " + Thread.currentThread().getName() + ", Time : " + new Date());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//        }
    }
}
