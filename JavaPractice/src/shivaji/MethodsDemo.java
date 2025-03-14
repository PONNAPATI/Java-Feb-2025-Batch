package shivaji;

public class MethodsDemo {
    int d=100;
    int t=30;
    int b;
    void speed()
    {
        System.out.println(d/t);
    }
    int velocity()
    {
        b=d/t;
        return b;
    }

    public static void main(String[] args) {
        MethodsDemo md = new MethodsDemo();
        md.speed();
        System.out.println(md.velocity());
    }
}
