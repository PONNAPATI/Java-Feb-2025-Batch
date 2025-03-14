package StringMethods;

public class CsvSplitter {
    public static void main(String[] args) {
        // A sample CSV line with extra spaces after commas
        String csvLine = " Sagar, Vijay, 25, Engineer ";

        // Split the line using a comma as the delimiter
        String[] fields = csvLine.split(",");

        // Check if we got exactly 4 parts
        if (fields.length == 4) {
            // Trim extra spaces from each field so they don't have leading/trailing spaces
            for (int i = 0; i < fields.length; i++) {
                fields[i] = fields[i].trim();
            }

            String firstName = fields[0];    // "Sagar"
            String lastName = fields[1];     // "Vijay"
            int age = Integer.parseInt(fields[2]); // 25 (parses correctly even with spaces)
            String jobTitle = fields[3];     // "Engineer"

            // Print each field
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
            System.out.println("Age: " + age);
            System.out.println("Job Title: " + jobTitle);
        } else {
            // If the line doesn't split into exactly 4 parts, it's not in the expected format
            System.out.println("CSV line is not in the expected format.");
        }
    }
}
