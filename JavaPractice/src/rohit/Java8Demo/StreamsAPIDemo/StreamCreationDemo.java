package rohit.Java8Demo.StreamsAPIDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Borra", "Venkata","Rohit", "Krishna");
        //Stream Creation 1
        Stream<String> name=names.stream();
        //Stream Creation From Arrays
        String[] fruits = {"Apple", "Banana", "Mango"};
        Stream<String> fruit=Arrays.stream(fruits);
        //Stream Creation using Stream.of()
        Stream<String> country=Stream.of("India", "USA", "Canada", "UK");

    }
}
