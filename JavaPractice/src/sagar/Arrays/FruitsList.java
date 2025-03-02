package Arrays;
//Single-Dimensional Array:
//Scenario: You have a small list of fruits (3 types). You’ll store them in a one-dimensional array and print them.

public class FruitsList {
    public static void main(String[] args) {
        // Create an array with 3 fruits

        String[] fruits = {"Apple, Orange, Banana."};

        // Print each fruit using a simple for-loop
        System.out.println("----- Fruits in the Array -----");

        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruits " + (i + 1) + ": " + fruits[i]);
        }
    }
}

/*
Loops from i = 0 to i = 2 (since fruits.length is 3).
Prints each fruit with its index (plus one, for readability).
Single-Dimensional Arrays:
Store elements in a linear fashion (e.g., a list of fruits).
Access them with a single index: array[i].
*/

