package ClassAndMethods.ecommerce;

/**
 * This class represents a product in the e-commerce system.
 */
public class Product {
    public Integer getName;
    private String productID;
    private String name;
    private double price;

    // Constructor to initialize product details
    public Product(String productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    // Getter methods
    public String getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Method to display product details
    public void showProductDetails() {
        System.out.println("Product ID: " + productID + ", Name: " + name + ", Price: $" + price);
    }
}
