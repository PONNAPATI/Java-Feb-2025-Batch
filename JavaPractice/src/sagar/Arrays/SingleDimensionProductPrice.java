package Arrays;

public class SingleDimensionProductPrice {
    public static void main(String[] args) {
        // Array to store prices of 5 products, This simulates having multiple products, each with a specific price.
        double [] prices = {9.99, 14.49, 3.50, 11.99, 2.0};

        //Access and print each price

        /*       Dynamic: This approach uses a for loop to iterate through the entire array. If you add more elements to prices (e.g., 6th or 7th product),
                            the loop automatically adapts to print them without having to change any other lines of code.
                Scalable: Works well even if the array has 5, 10, or 100 elements.
                Less prone to typos: You’re less likely to make mistakes referencing the wrong index or repeating lines.*/

        System.out.println("==== Product Prices ====");
        for (int i = 0; i < prices.length; i++){
            System.out.println(" Product " + (i + 1) + "prices : $ " + prices[i]);
        }


        //Manually Printing Each Element
       /* Hard-coded: This explicitly prints each element of the array by index.
        Not flexible: If you change the array size (e.g., add a 6th product), you must manually add another System.out.println(...) statement. Otherwise, the new element won’t be printed.
                Easier to read at a glance (if the array is small and fixed), but not ideal for any situation where the array might grow or shrink.*/

        System.out.println("Product 1 Price : $ " + prices[0]); // 9.99
        System.out.println("Product 2 Price : $ " + prices[1]); // 14.49
        System.out.println("Product 3 Price : $ " + prices[2]); // 3.50
        System.out.println("Product 4 Price : $ " + prices[3]); // 11.99
        System.out.println("Product 5 Price : $ " + prices[4]); // 4.0

        // Compute total cost if someone buys one of each
        double totalCost = 0.0;
        for (int i = 0; i < prices.length; i++){
            totalCost += prices [i];
        }
        System.out.println("Total cost of all products: $" +totalCost);
    }
}

// We used a double[] for prices (floating-point numbers).
// prices.length gives the size of the array.
// We added up all prices using a for loop.
