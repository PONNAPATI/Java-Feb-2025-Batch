package src.lurdhu.java8.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
//        List<String> names1 = Arrays.asList("John", "Thomas", "Nikki");

        names.add("John");
        names.add("Thomas");
        names.add("Nikki");

        Stream<String> namesStream = names.stream();

    }
}
