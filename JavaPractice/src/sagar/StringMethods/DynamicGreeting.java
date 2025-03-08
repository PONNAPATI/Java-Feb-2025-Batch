package StringMethods;

public class DynamicGreeting {
    public static void main(String[] args) {
        String userName = "Vijay";
        String greetingTemplate = "Hello %s, welcome to our systems!";

        // Format the greeting using the user's name
        String finalGreeting = String.format(greetingTemplate, userName);

        System.out.println(finalGreeting);
    }
}
