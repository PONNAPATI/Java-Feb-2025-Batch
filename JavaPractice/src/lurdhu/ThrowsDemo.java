package src.lurdhu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDemo {
    public static void main(String[] args) {
        try {
            readMyFile("test.tx");
        } catch (FileNotFoundException e) {
            System.out.println("Handling exception logic");
        } catch (Exception e){
            System.out.println("Handling exception using generic catch block...");
        }
    }

    private static void readMyFile(String fileName) throws FileNotFoundException {

        FileInputStream file = new FileInputStream(fileName);


        System.out.println("File opened successfully.");
    }
}
