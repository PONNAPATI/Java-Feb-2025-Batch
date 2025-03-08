package oop.MethodOverloading.CoffeeMachine;

public class MainCoffeeMachine {
    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();

        machine.brewCoffee();
        machine.brewCoffee("Large");
        machine.brewCoffee("Medium", "Vanilla");
    }
}
