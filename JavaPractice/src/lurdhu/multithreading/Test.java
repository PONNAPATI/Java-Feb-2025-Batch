package src.lurdhu.multithreading;

import java.util.Date;

public class Test extends Thread{
    public void run(){  // run method is mandatory as the start() method is internally going to call the run() method
        for(int i = 0; i < 5; i++){
            try {
                Thread.sleep(5000);  // time is in milli seconds here
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread Name : " + Thread.currentThread().getName() + "-" + i + ", Time : " + new Date());
        }
    }

}
