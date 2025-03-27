package src.lurdhu.java8.streamapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapMethodDemo {
    public static void main(String[] args) {

        List<List<Integer>> outerList = new ArrayList<>();

        List<Integer> innnerList1 = new ArrayList<>();
        innnerList1.add(1);
        innnerList1.add(2);
        innnerList1.add(3);

        List<Integer> innnerList2 = new ArrayList<>();
        innnerList2.add(4);
        innnerList2.add(5);
        innnerList2.add(6);


        outerList.add(innnerList1);
        outerList.add(innnerList2);

        System.out.println(outerList);

        List<Integer> flattenedElements = outerList.stream()
                .flatMap(element -> element.stream())// flattens the complex structure
                .filter(ele -> ele % 2 == 0)     // filters only even numbers
                .collect(Collectors.toList());

        System.out.println(flattenedElements);
    }
}
