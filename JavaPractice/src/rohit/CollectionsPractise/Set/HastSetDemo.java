package rohit.CollectionsPractise.Set;

import java.util.HashSet;
import java.util.Set;

public class HastSetDemo {

    public static void main(String[] args) {


        Set<String> set = new HashSet<>();
        set.add("RK1");
        set.add("RK2");
        set.add("RK1");
        set.add("RK3");
        set.add(null);
        set.add(null);

        System.out.println(set);
    }

}
