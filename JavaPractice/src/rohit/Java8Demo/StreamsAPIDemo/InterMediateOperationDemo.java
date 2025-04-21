package rohit.Java8Demo.StreamsAPIDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterMediateOperationDemo {

    public static void main(String[] args) {
        List<String> names= Arrays.asList("RK1", "RK2", "RK3", "RK4");
        //Using .filter
        List<String> filterednames=names.stream().filter(name->name.contains("RK")).collect(Collectors.toList());
        System.out.println(filterednames);

        //Using .Map
        List<String> cars= Stream.of("BMW", "Mercedes", "Audi", "Rollyroyce","Lambo","Porche").map(name->name.toUpperCase()).collect(Collectors.toList());
        System.out.println(cars);

        //Using FlatMap
        List<List<Integer>> mylist = Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(4,5,6));
        List<Integer> num =mylist.stream().flatMap(element->element.stream()).filter(e->e>3).collect(Collectors.toList());
        System.out.println(num);

    }
}
