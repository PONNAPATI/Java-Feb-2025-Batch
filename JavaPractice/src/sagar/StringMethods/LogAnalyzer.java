package StringMethods;

public class LogAnalyzer {
    public static void main(String[] args) {
        // A sample log message to analyze
        String logMessage = "2025-03-01 10:35:21 [INFO] Starting backup process.....";

        // Check if the log contains the substring "[ERROR]"
        if (logMessage.contains("[ERROR]")) {
            // If it does, we report that an error was found

            System.out.println("Error found in the log!");

            // If not, check if it contains "[INFO]"
        } else if (logMessage.contains("[INFO]")) {

            // If "[INFO]" is found, we determine where in the string it appears
            int index = logMessage.indexOf("[INFO]");
            System.out.println(" '[INFO]' found at index: " +index);

            // If neither "[ERROR]" nor "[INFO]" is present, display a different message
        }else {
            System.out.println("No Error or info message found.");
        }
    }
}
