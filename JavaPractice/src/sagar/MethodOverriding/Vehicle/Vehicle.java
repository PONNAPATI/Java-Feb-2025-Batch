package MethodOverriding.Vehicle;

public class Vehicle {
    // Parent class method
    public void startEngine() {
        System.out.println("Vehicle engine started.");
    }
}

class Car extends Vehicle {
    //Overriding the parent method
    @Override
    public void startEngine() {
        System.out.println(("Car engine Started with a Big Sound!"));
    }
}

class Bike extends Vehicle {
    //Overriding the parent method
    @Override
    public void startEngine(){
        System.out.println("Bike engine started with a Low Sound!");
    }
}



