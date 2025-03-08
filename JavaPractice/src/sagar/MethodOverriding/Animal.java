package MethodOverriding;

public class Animal {
    public void makeSound(){
        System.out.println("Some generic animal sound...");
    }
}
 class Dog extends Animal {
    @Override
     public void makeSound(){
        System.out.println("Bow!.. Bow!");
    }
 }
 class Cat extends Animal {
    @Override
     public void makeSound() {
        System.out.println("Meow! .. Meow!");
    }
 }
