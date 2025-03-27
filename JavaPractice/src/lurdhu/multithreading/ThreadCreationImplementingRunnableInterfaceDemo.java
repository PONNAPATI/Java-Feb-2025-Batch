package src.lurdhu.multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadCreationImplementingRunnableInterfaceDemo {
    public static void main(String[] args) {   // main method is one thread
        Thread thread1 = new Thread(new Student());

//        Thread thread1 = new Thread(() -> {
//            System.out.println("Thread name is : " + Thread.currentThread().getName());
//        });

        Thread thread2 = new Thread(new Student());

        thread1.setName("my-thread-1");
        thread2.setName("my-thread-2");


//        thread2.setPriority(1);
//        thread1.setPriority(9);

        thread1.start();
        thread2.start();

//        Student s = new Student();
//        s.run();
    }
}
