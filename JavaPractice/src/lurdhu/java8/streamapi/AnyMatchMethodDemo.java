package src.lurdhu.java8.streamapi;

import java.util.Arrays;
import java.util.List;

public class AnyMatchMethodDemo {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jacob", "Mary", "Roslin", "Jane");
        boolean isLetterContainsN = names.stream()
                .anyMatch(name -> name.contains("n"));

        System.out.println(isLetterContainsN);
    }

}
