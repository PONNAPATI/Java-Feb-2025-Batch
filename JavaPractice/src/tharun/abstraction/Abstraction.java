package tharun.abstraction;

public class Abstraction {
    public static void main(String[] args) {
            Vehicle c = new Car();
            c.start();
            Vehicle b = new Bike();
            b.start();
             c.stop();

    }
}
