package src.lurdhu.collectons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("John");
        names.add("Thomas");
        names.add("Nikki");
        names.add("Vlad");
        names.add("Thomas");
        names.add("Thomas");

        System.out.println("Before sorting : " + names);

        Collections.sort(names);
        System.out.println("After sorting : " + names);

        Collections.reverse(names);
        System.out.println("After reversing : " + names);

        int frequency = Collections.frequency(names, "Thomas");
        System.out.println("Frequency of element Thomas is : " + frequency);
    }
}
