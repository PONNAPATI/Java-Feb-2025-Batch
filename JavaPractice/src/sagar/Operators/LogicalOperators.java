package Operators;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean isRaining = true;
        boolean haveUmbrella = false;

        // AND (&&): true only if both conditions are true
        if (isRaining && haveUmbrella) {
            System.out.println("You are safe from the rain!");
        } else {
            System.out.println("You might get wet.");
        }

        // OR (||): true if at least one condition is true
        boolean eitherOne = isRaining || haveUmbrella;
        System.out.println("Either it's raining OR I have an umbrella: " + eitherOne); // true

        // NOT (!): inverts the boolean value
        System.out.println("It's not raining: " + !isRaining); // false
    }
}

/*

&& (AND) short-circuits: if the first condition is false, it won’t check the second.
        || (OR) short-circuits: if the first condition is true, it won’t check the second.
        ! (NOT) flips true to false or false to true.

 */

