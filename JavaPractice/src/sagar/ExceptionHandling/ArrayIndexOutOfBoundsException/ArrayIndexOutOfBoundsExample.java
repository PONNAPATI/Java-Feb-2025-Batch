package ExceptionHandling.ArrayIndexOutOfBoundsException;

public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 7, 3, 8};
        // Trying to access index 5 which doesn't exist (valid indices are 0-4)
        int invalidAccess = numbers[5];
        System.out.println("Value at index 5: " + invalidAccess);
    }
}
