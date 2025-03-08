package MethodOverriding.Animal;

public class MainAnimal {
     public static void main(String[] args) {
         Animal animal = new Animal();
         Animal dog = new Dog();
         Animal cat = new Cat();
         
         animal.makeSound();
         dog.makeSound();
         cat.makeSound();
     }
 }
