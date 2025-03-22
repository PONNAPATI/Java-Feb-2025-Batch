package src.lurdhu.multithreading;

public class ThreadClassMethodsDemo {
    public static void main(String[] args) {
        System.out.println("thread name : " + Thread.currentThread().getName());

        System.out.println("Is main method deamon : " + Thread.currentThread().isDaemon());

//        Thread.currentThread().setDaemon(true);

        // pausing the thread execution for 10 seconds
        try {
            Thread.sleep(10000);  // here the time is in milliseconds. 10000 milliseconds
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("thread state : " + Thread.currentThread().getState());
        System.out.println("threadgroup name : " + Thread.currentThread().getThreadGroup().getName());
    }
}
