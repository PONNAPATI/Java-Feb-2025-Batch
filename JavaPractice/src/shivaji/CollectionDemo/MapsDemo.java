package shivaji.CollectionDemo;

import java.util.HashMap;
import java.util.TreeMap;

public class MapsDemo {
    public static void main(String[] args) {
        // HashMap: Key-value pairs, unordered
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(4,"asdf");
        hm.put(2,"lkjh");
        hm.put(3,"poiu");
        hm.put(2,"asdf");
        System.out.println(hm);

        String getDefaultValue = hm.getOrDefault(8, "ASDFGHJKL");
        System.out.println(getDefaultValue);


        // TreeMap: Key-value pairs, ordered by key
        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(2,"lkjh");
        tm.put(1,"asdf");
        System.out.println(tm);

    }
}
