package StringMethods;

public class FileExtensionChecker {
    // The file name we want to check
    public static void main(String[] args) {
        String fileName = "document.pdf";

    // Check if the filename ends with ".pdf"
        if (fileName.endsWith(".pdf")) {

            // If yes, it's a PDF file
            System.out.println("This is a PDF file.");

            // Otherwise, check if it ends with ".jpg" or ".jpeg"
        } else if (fileName.endsWith(".jpg") || fileName.endsWith(".jpeg")) {
            // If yes, it's an image file
            System.out.println("This is an image file.");
        }else {
            // If none of the above conditions match, the file format is unknown
            System.out.println("Unknown file format.");
        }
    }
}


//The endsWith(".pdf") method checks whether the string ends with the substring ".pdf".