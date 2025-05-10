package ExceptionHandling.ArithmeticException;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        int A = 10;
        int B = 0;
        // This line will throw ArithmeticException because of division by zero
        int result = A/B;
        System.out.println("Result :" + result);
    }
}
