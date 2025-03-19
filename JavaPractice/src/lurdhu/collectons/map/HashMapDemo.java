package src.lurdhu.collectons.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> phoneBook = new HashMap<>();

        phoneBook.put("Alok", 999999999);
        phoneBook.put("Abhi", 888888888);
        phoneBook.put("Rakesh", 777777777);
        phoneBook.put("Lurdhu", 888888888);

        System.out.println(phoneBook);

        phoneBook.put("Abhi", 666666666);
        System.out.println("printing map after adding a duplicate key");
        System.out.println(phoneBook);


        System.out.println("getting value from key : " + phoneBook.get("Rakesh"));

        // important method
        Integer getDefaultValue = phoneBook.getOrDefault("Arjun", 22222222);
        System.out.println("getOrDefault : " + getDefaultValue);

        Set<String> keys = phoneBook.keySet();
        System.out.println("printing all keys in the map :" + keys);

        Collection<Integer> values = phoneBook.values();
        System.out.println("printing all values in the map :" + values);

        Set<Map.Entry<String, Integer>> entries = phoneBook.entrySet();
        System.out.println("printing entries");
        for (Map.Entry<String, Integer> entry : entries){
            if (entry.getKey().equals("Abhi")) {
                // write your own logic if the entry key is "Abhi"
                System.out.println(entry.getKey() +"-"+ entry.getValue());
            }
        }

        phoneBook.remove("Abhi");
        System.out.println("printing elements after removing 'Abhi'");
        System.out.println(phoneBook);

        System.out.println("contains key : " + phoneBook.containsKey("Lurdhu"));
        System.out.println("contains value : " + phoneBook.containsValue(11111111));
    }
}
