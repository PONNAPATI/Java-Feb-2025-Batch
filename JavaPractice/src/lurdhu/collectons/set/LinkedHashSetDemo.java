package src.lurdhu.collectons.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> mySet = new LinkedHashSet<>();

        mySet.add("John");
        mySet.add("Roslin");
        mySet.add("Thomas");
        mySet.add("Roslin");
        mySet.add(null);
        mySet.add(null);

        System.out.println(mySet);
    }
}
