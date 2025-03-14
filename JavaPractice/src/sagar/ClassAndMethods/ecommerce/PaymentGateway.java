package ClassAndMethods.ecommerce;

/**
 * This class handles payment processing.
 */
public class PaymentGateway {
    // Method to process payment
    public static boolean processPayment(double amount, String paymentMethod) {
        System.out.println("\nProcessing payment of $" + amount + " using " + paymentMethod + "...");
        return true; // Simulating successful payment
    }
}
