package src.lurdhu.multithreading;

public class ThreadCreationExtendingThreadClassDemo {
    public static void main(String[] args) {  // main thread
        Test t1 = new Test();  // new state
        Test t2 = new Test();

        t1.setName("MyThread1");
        t2.setName("MyThread2");

        t1.setPriority(1);  // thread priorities are from 1 to 10. Default priority 5

        t1.start();  // Runnable state   // spawning new t1 thread
        t2.start();  // Runnable state   // spawning new t2 thread

    }
}
