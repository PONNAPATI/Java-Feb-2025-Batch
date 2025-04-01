package src.lurdhu.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamsDemo {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Thomas", "Nikki", "Vlad", "Sagar", "Arjun");

        List<String> upperCaseSortedNamesList = names.stream()
                .map(name -> name.toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        System.out.println(upperCaseSortedNamesList);


        List<String> upperCaseSortedNamesList2 = names.parallelStream()
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(upperCaseSortedNamesList2);


    }
}
