package shivaji.LamdaExpDemo;

public class Demo{
    public static void main(String[] args) {
        DemoInterface di = i ->System.out.println("Showed up "+i);
        di.show(5);
    }
}
