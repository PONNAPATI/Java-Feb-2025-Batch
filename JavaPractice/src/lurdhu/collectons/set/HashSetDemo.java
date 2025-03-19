package src.lurdhu.collectons.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();

        mySet.add("John");
        mySet.add("Roslin");
        mySet.add("Thomas");
        mySet.add("Roslin");
        mySet.add(null);
        mySet.add(null);


        System.out.println("size : "+ mySet.size());
        System.out.println("contains : "+ mySet.contains("Thomas"));


        System.out.println(mySet);
    }
}
