package src.lurdhu.multithreading;

import java.util.Date;

public class Student implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            System.out.println("Thread : " + Thread.currentThread() + "-" + i + ", Time : " + new Date());
        }
    }
}
