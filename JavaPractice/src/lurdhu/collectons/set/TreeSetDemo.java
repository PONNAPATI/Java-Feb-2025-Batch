package src.lurdhu.collectons.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> ages = new TreeSet<>();

        ages.add(50);
        ages.add(10);
        ages.add(70);
        ages.add(30);
        ages.add(20);
        ages.add(10);
//        ages.add(null);  // Not allowed

        System.out.println(ages);

    }
}
