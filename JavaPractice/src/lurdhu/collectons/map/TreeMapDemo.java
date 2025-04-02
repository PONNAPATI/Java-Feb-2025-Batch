package src.lurdhu.collectons.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String, String> myMap = new TreeMap<>();

        myMap.put("Joh", "123");
        myMap.put("Alok", "456");
        myMap.put("Bharat", "786");

        System.out.println(myMap);
    }
}
