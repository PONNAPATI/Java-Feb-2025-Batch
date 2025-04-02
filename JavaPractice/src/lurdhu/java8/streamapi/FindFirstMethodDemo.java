package src.lurdhu.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstMethodDemo {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jacob", "Mary", "Roslin", "Jane");
        Optional<String> result = names.stream()
                .filter(name -> name.startsWith("J"))
                .findFirst();

        System.out.println(result.get());
    }
}
