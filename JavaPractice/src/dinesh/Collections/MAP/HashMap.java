package dinesh.Collections.MAP;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {

        //Initialize the HashMap
        Map<Integer, String> CaptainsAgeCategory = new java.util.HashMap<>();

        //Add Elements for Map
        CaptainsAgeCategory.put(14,"Mithul");
        CaptainsAgeCategory.put(18,"Maheshwar");
        CaptainsAgeCategory.put(21,"Manoj");

        //Iterate the maps using For  each loop

        for (Map.Entry<Integer,String> players : CaptainsAgeCategory.entrySet())
            System.out.println(" Name: " + players.getValue() + " Age: " + players.getKey() );


    }
}
