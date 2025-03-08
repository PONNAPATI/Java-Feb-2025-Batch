package ClassAndMethods.ecommerce;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a shopping cart where users can add and remove products.
 */
public class ShoppingCart {
    private List<Product> products; // List to store products
    private List<Integer> quantities; // List to store quantities

    public ShoppingCart() {
        products = new ArrayList<>();
        quantities = new ArrayList<>();
    }

    // Method to add a product to the cart
    public void addProduct(Product product, int quantity) {
        if (quantity <= 0) {
            System.out.println("Invalid quantity. Please add at least 1 item.");
            return;
        }
        int index = products.indexOf(product);
        if (index != -1) {
            // Product already exists, update quantity
            quantities.set(index, quantities.get(index) + quantity);
        } else {
            // Add new product and quantity
            products.add(product);
            quantities.add(quantity);
        }
        System.out.println(quantity + "x " + product.getName() + " added to cart.");
    }

    // Method to calculate total price of cart
    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < products.size(); i++) {
            total += products.get(i).getPrice() * quantities.get(i);
        }
        return total;
    }

    // Method to display cart contents
    public void showCart() {
        System.out.println("\nShopping Cart:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println(quantities.get(i) + "x " + products.get(i).getName() + " - $" + products.get(i).getPrice() * quantities.get(i));
        }
        System.out.println("Total Price: $" + calculateTotal());
        System.out.println("----------------------");
    }
}
