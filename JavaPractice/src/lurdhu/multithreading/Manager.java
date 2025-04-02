package src.lurdhu.multithreading;

public class Manager extends Employee implements Runnable {  // we can not extend Thread class here due to diamond issue in multiple classes inheritance and hence we are going with implementing Runnable interface

    public void run() {
        // some piece of code that i want to execute parallally....
    }
}
