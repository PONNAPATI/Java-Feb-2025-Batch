package src.lurdhu.inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.legs = 4;  // inherited class variable
        myCat.sound();
        myCat.eat();  // inherited method


//        A a = new A();
//        a.a();
//        a.b();
//        a.c();
    }
}
