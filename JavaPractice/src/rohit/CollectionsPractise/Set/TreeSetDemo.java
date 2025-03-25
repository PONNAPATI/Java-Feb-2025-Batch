package rohit.CollectionsPractise.Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Double> ts = new TreeSet<>();
        ts.add(58.23);
        ts.add(56.26);
        ts.add(10.0);
        ts.add(0.0);
     //   ts.add(null);

        System.out.println(ts);
    }
}
