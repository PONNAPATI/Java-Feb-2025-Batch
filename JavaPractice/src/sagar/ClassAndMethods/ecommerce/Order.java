package ClassAndMethods.ecommerce;

/**
 * This class represents an order placed by the customer.
 */
public class Order {
    private String orderId;
    private double totalAmount;
    private boolean isShipped;

    // Constructor to create an order
    public Order(String orderId, double totalAmount) {
        this.orderId = orderId;
        this.totalAmount = totalAmount;
        this.isShipped = false; // Default: Order is not shipped
    }

    // Method to display order details
    public void showOrderDetails() {
        System.out.println("\nOrder ID: " + orderId);
        System.out.println("Total Amount: $" + totalAmount);
        System.out.println("Status: " + (isShipped ? "Shipped" : "Processing"));
        System.out.println("----------------------");
    }

    // Method to simulate shipping the order
    public void shipOrder() {
        isShipped = true;
        System.out.println("Order " + orderId + " has been shipped.");
    }
}
