package src.lurdhu.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMethodDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(30,6,4,3,2,8,1,16,5,10,20);

         List<Integer> filteredSortedList = numbers.stream()
                .filter(element -> element % 2 == 0)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(filteredSortedList);
    }
}
