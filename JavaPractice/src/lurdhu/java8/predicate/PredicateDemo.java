package src.lurdhu.java8.predicate;


import java.util.Arrays;
import java.util.List;

public class PredicateDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Thomas", "Nikki");
        names.stream().filter(name -> name.startsWith("T")).forEach(System.out::println);
    }
}
