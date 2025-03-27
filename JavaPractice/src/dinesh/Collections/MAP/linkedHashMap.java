package dinesh.Collections.MAP;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashMap implements Comparable<linkedHashMap> {
    String Name;
    Double Height;
    Boolean isPlayerFit;


    public linkedHashMap(String Name, double Height, boolean isPlayerFit ){
        this.Name = Name;
        this.Height = Height;
        this.isPlayerFit = isPlayerFit;
    }

    @Override
    public String toString() {
        return "LinkedHashMap{" +
                "Name='" + Name + '\'' +
                ", Height=" + Height +
                ", isPlayerFit=" + isPlayerFit +
                '}';
    }

    @Override
    public int compareTo(linkedHashMap o) {
        return this.Height.compareTo(o.Height);
    }

    public static void main(String[] args) {
        Map<Double, linkedHashMap> NameAndHeight = new java.util.LinkedHashMap<>();


        NameAndHeight.put(7.78, new linkedHashMap("Dinesh", 7.89,true));

        NameAndHeight.put(6.77, new linkedHashMap("vikranth", 6.89, false));

        NameAndHeight.put(7.99,new linkedHashMap("Balaji", 7.896, true));

        displayAthleteRecords(NameAndHeight);
}
//        for (Map.Entry<Double, linkedHashMap> player : NameAndHeight)
//        System.out.println(NameAndHeight);
        public static void displayAthleteRecords(Map<Double, linkedHashMap> athleteMap) {
            System.out.println("Athlete roster in insertion order:");
            for (Map.Entry<Double, linkedHashMap> entry : athleteMap.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Name: " + entry.getValue().Name +
                        ", Height: " + entry.getValue().Height + ", Fit: " + entry.getValue().isPlayerFit);
            }
    }



}
