<<<<<<<< HEAD:JavaPractice/src/sagar/oop/MethodOverriding/Animal/MainAnimal.java
package oop.MethodOverriding.Animal;
========
package MethodOverriding;
>>>>>>>> parent of b269ff8 (Adding one more Practice example on MethodOverRiding.):JavaPractice/src/sagar/oop/MethodOverriding/MainAnimal.java

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
