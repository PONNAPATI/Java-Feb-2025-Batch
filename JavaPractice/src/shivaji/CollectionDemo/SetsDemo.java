package shivaji.CollectionDemo;

import java.util.HashSet;
import java.util.TreeSet;

public class SetsDemo {
    public static void main(String[] args) {
        // HashSet: Unordered set, does not allow duplicates
        HashSet<String> hs = new HashSet<>();
        hs.add("asdf");
        hs.add("lkjh");
        hs.add("asdf");
        System.out.println(hs);

        // TreeSet: Ordered set, does not allow duplicates
        TreeSet<String> ts = new TreeSet<>();
        ts.add("lkjh");
        ts.add("asdf");
        ts.add("asdf");
        ts.add("aaaa");
        System.out.println(ts);
    }
}
