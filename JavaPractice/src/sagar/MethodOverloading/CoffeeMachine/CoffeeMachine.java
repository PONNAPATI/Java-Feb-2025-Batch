package MethodOverloading.CoffeeMachine;

public class CoffeeMachine {
    // Overloaded method #1: Just brew a basic coffee
    public void brewCoffee(){
        System.out.println("Brewing a standard coffee");
    }
    // Overloaded method #2: Specify size
    public void brewCoffee(String size) {
        System.out.println("Brewing a " + size + "Coffee");
    }
    // Overloaded method #3: Specify size and extra flavor
    public void brewCoffee(String size, String flavor){
        System.out.println("Brewing a " + size + "Coffee" + flavor + "flavor....!");
    }
}
