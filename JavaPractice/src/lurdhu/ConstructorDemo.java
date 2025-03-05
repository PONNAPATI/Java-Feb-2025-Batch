package src.lurdhu;

public class ConstructorDemo {

    public static void main(String[] args) {
        Car car = new Car();
        car.setName("");
        car.setSpeed(120);
        car.setEngineType("");
        car.hello();

        Car car1 = new Car("BMW", "XYZ", 120);
        car1.printVariables();

      Car car2 = new Car("Maruthi", 100);
      // 100 lines of code
      car2.setEngineType("LMN");

    }
}
