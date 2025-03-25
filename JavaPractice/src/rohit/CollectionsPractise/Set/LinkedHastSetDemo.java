package rohit.CollectionsPractise.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHastSetDemo {
    public static void main(String[] args) {
        Set<Integer> lhs= new LinkedHashSet<>();
        lhs.add(1);
        lhs.add(2);
        lhs.add(3);
        System.out.println(lhs);
    }
}
