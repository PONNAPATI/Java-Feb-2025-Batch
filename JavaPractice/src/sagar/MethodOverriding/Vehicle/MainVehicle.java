package MethodOverriding.Vehicle;

public class MainVehicle {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Car();
        Vehicle v3 = new Bike();

        v1.startEngine();
        v2.startEngine();
        v3.startEngine();
    }
}
