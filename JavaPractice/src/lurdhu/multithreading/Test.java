package src.lurdhu.multithreading;

import java.util.Date;

public class Test extends Thread{
    public void run(){  // run method is mandatory as the start() method is internally going to call the run() method
        for(int i = 0; i < 5; i++){
            System.out.println("Thread : " + Thread.currentThread() + "-" + i + ", Time : " + new Date());
        }
    }

}
