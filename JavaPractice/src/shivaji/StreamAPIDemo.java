package shivaji;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIDemo {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(4,5,6,7,8,9);
        for (int n : ls)
        {
            System.out.println(n);
        }
        System.out.println("-----------------");
        //Using for each method for lists
        ls.forEach(n -> System.out.println(n));

        int a =  ls.stream()
                .filter(n -> n%2==0)
                .map(n -> n*2)
                .reduce(0,(x,y) -> (x+y));
        System.out.println(a);

        Stream<Integer> st = Stream.of(1,3,3,5,6,7,8,9);
        st.forEach(n -> System.out.print(n));
    }
}
