package src.lurdhu.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterMethodDemo {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Thomas", "Nikki");


       List<String> filteredNames = names.stream()
               .filter(name -> name.startsWith("T"))
               .collect(Collectors.toList());

        System.out.println(filteredNames);
    }
}
