package Operators;
// Operators: + (addition), - (subtraction), * (multiplication), / (division), % (modulus), ++ (increment), -- (decrement)

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction  (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b): " + (a / b));
        System.out.println("Modulus (a % b): " + (a % b));

        // Increment and Decrement
        a++; // 11
        System.out.println("After a++: " + a);
        b--; // 4
        System.out.println("After b--: " + b);
    }
}

// ++ (increment) and -- (decrement) change the variable by 1.
