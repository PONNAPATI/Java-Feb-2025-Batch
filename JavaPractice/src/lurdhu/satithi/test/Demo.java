package src.lurdhu.satithi.test;

public class Demo {
    public static void main(String[] args) {
        Parent p = new Child(); // wide casting
        p.test();
        ((Child) p).test2();  // narrow casting

        Child c = new Child();
        c.test();
        c.test2();
    }
}
