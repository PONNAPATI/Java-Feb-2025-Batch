<<<<<<<< HEAD:JavaPractice/src/sagar/oop/MethodOverriding/Animal/Animal.java
package oop.MethodOverriding.Animal;
========
package MethodOverriding;
>>>>>>>> parent of b269ff8 (Adding one more Practice example on MethodOverRiding.):JavaPractice/src/sagar/oop/MethodOverriding/Animal.java

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
