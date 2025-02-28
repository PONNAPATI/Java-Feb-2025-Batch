package ForEachLoop;

public class DisscountEmails {
    public static void main(String[] args) {
        String [] customers = {"Vijay", "Sagar", "Lourdu", "Jeevan", "Saurav", "Sai", "Hanu"};
        System.out.println("Sending Disscount Emails: ");

        for (int i = 0; i < customers.length; i ++) {
            System.out.println("Email sent to: " + customers[i] + " - Enjoy 10% off!");
        }
    }
}
