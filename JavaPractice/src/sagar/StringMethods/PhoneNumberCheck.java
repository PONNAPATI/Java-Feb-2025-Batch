package StringMethods;

public class PhoneNumberCheck {
    public static void main(String[] args) {
        String phoneNumber = "1234567890";

        // A very simple check: ensure all characters are digits
        boolean isAllDigits = phoneNumber.matches("\\d+");  // "\\d+" means: one or more digits

        // If the regex check passes, it's a valid numerical phone number format
        if (isAllDigits) {
            System.out.println("Valid Phone number format.");

            // Otherwise, it contains non-digit characters, making it invalid
        }else {
            System.out.println("Invalid phone number format.");
        }
    }
}
