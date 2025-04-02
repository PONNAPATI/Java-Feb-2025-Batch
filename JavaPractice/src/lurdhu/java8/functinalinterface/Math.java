package src.lurdhu.java8.functinalinterface;

public class Math implements NonFunctionalInterfaceDemo {
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int subtract(int c, int d) {
        return c-d;
    }

    @Override
    public int multiply(int m, int n) {
        return m*n;
    }
}
