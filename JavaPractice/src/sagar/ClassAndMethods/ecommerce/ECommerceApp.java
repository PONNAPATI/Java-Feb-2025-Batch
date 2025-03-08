package ClassAndMethods.ecommerce;

/**
 * This is the main class that runs the e-commerce shopping system.
 */
public class ECommerceApp {
    public static void main(String[] args) {
        // Step 1: Create some products
        Product product1 = new Product("P001", "Laptop", 1200.00);
        Product product2 = new Product("P002", "Smartphone", 800.00);
        Product product3 = new Product("P003", "Headphones", 150.00);

        // Display product details
        System.out.println("\nAvailable Products:");
        product1.showProductDetails();
        product2.showProductDetails();
        product3.showProductDetails();

        // Step 2: Create a shopping cart
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(product1, 1);
        cart.addProduct(product2, 2);
        cart.addProduct(product3, 1);
        cart.showCart();

        // Step 3: Process payment
        double totalAmount = cart.calculateTotal();
        boolean paymentSuccess = PaymentGateway.processPayment(totalAmount, "Credit Card");

        if (paymentSuccess) {
            // Step 4: Create an order
            Order order = new Order("ORD123", totalAmount);
            order.showOrderDetails();

            // Step 5: Ship the order
            order.shipOrder();
            order.showOrderDetails();
        }
    }
}
