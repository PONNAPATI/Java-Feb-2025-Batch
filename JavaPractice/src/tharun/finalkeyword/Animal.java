package tharun.finalkeyword;

public class Animal {
    public final void sound(){

        System.out.println("Animal makes sound");
    }
    public static class Dog extends Animal{

        // if we remove the comments it wil gives you compile time error
//        public void sound(){
//            System.out.println("Dog makes sound");
//        }

        public static void main(String[] args) {
            Animal animal = new Animal();
            animal.sound();
        }
    }
}
