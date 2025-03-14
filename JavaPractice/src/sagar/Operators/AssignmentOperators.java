package Operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        int x = 7; // Simple assignment (x is now 5)

        x += 3;
        x -= 2;
        x *= 2;
        x /= 2;
        x %= 3;

        System.out.println("Final value of x: " + x);
    }
}

// +=, -=, *=, /=, %= provide shortcuts to combine arithmetic with assignment.
// x += y is shorthand for x = x + y.
