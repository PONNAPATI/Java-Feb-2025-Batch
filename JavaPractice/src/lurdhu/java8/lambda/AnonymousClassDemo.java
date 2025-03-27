package src.lurdhu.java8.lambda;

public class AnonymousClassDemo {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void walk() {
                System.out.println("Anonymous class method");
            }
        };


        animal.walk();

    }

}
