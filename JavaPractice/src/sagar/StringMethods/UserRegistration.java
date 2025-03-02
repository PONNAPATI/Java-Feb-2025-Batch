package StringMethods;

public class UserRegistration {
    public static void main(String[] args) {
        // Simulated raw user input
        String rawFirstName = "   Vijay  ";
        String rawLastName = "  Sagar  ";
        String rawEmail = "  Vijay.SAGAR@Example.com  ";

        // Trim and normalize
        // .trim() removes leading and trailing whitespace.
        // .toLowerCase() (or .toUpperCase()) can be used to normalize the case of the string.

        String firstName = rawFirstName.trim();   // "Vijay"
        String lastName = rawLastName.trim();     // "Sagar"
        String email = rawEmail.trim().toLowerCase(); // "vijay.sagar@example.com"

        // Check if email contains basic parts
        if (email.contains("@") && email.contains(".")) {
            System.out.println("Valid email: " + email);
        } else {
            System.out.println("Invalid email format.");
        }

        // Print final results
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
    }
}