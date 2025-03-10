package src.lurdhu.methodoverriding;

public class Cat extends Animal{
    public  void walk() {
        System.out.println("This is child class walk method");
    }

    public static void test(){
        System.out.println("This is child class static method");
    }

}
