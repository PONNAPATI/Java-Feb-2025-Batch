package shivaji;

public class ShortCircuitDemo {
    public static void main(String[] args) {
        int i=12;
        String  result =(i%2==0)? "Even":"odd";
        System.out.println(result);
    }
}
