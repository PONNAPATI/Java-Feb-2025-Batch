package src.lurdhu.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReduceMethodDemo {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        int finalResult = numbers.stream()
                        .reduce(0, (a, b) -> a+b);

        System.out.println(finalResult);
    }
}
