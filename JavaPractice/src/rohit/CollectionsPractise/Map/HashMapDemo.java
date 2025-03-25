package rohit.CollectionsPractise.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> hmd = new HashMap<>();
        hmd.put(1, "krishna");
        hmd.put(2, "Java");
        hmd.put(3, "Rohit");
        hmd.put(4, "Borra");
        hmd.put(5, "Venkata");

        System.out.println(hmd);
        hmd.put(1,"Test");
        System.out.println(hmd);

        System.out.println(hmd.get(2));
        System.out.println(hmd.keySet());
        hmd.remove(1);
        System.out.println(hmd);

        Collection values=hmd.values();
        System.out.println(values);

        Set<Map.Entry<Integer, String>> entries =hmd.entrySet();
        for (Map.Entry<Integer, String> es:entries){
            if (es.getKey().equals(2)){
                System.out.println("----------");
                System.out.println(es.getKey() +"="+ es.getValue());
            }

        }


    }

}
