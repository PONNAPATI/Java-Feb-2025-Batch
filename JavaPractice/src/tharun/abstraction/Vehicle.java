package tharun.abstraction;

public  abstract class Vehicle {

    public abstract void start();  // Abstract Method (doesn't have body)

    public void stop(){
        System.out.println("The vehicle has stopped");
    }
    public void color(){
        // Normal Method
    }
}

