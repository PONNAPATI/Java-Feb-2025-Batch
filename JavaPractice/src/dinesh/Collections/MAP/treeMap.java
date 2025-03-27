package dinesh.Collections.MAP;

import com.sun.source.tree.Tree;

import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class treeMap implements Comparable<treeMap> {
    String BatteryPower;
    Double    Mileage;

private static void SUZUKI(){
    String BatteryPower = "45 Kwh";
    Double Mileage = 395.0;
    System.out.println("For battery power of " +BatteryPower+"Suzuki electric cars They claim mileage of "+Mileage);
}

private static void Tata(){
    String BatteryPower = "45 Kwh";
    Double Mileage = 390.0;
    System.out.println("For battery power of " +BatteryPower+"Tata electric cars They claim mileage of "+Mileage);
}

public static void Hyundai(){
    String BatteryPower = "45 Kwh";
    int Mileage = 398;
    System.out.println("For battery power of " +BatteryPower+"Hyundai electric cars They claim mileage of "+Mileage);
}

treeMap(String BatteryPower, double    Mileage){
    this.BatteryPower = BatteryPower;
    this.Mileage = Mileage;
}
    @Override
    public int compareTo(treeMap o) {
        return this.Mileage.compareTo(o.Mileage);
    }

    @Override
    public String toString() {
        return "treeMap{" +
                "BatteryPower='" + BatteryPower + '\'' +
                ", Mileage=" + Mileage +
                '}';
    }

    public static void main(String[] args) {
        Map<Double, treeMap > EV = new TreeMap<>();
        Tata();
        SUZUKI();
        Hyundai();


        EV.put(390.0, new treeMap("Suzuki 45Kwh Battery",390));
        EV.put(395.0, new treeMap("Tata 45Kwh Battery", 395));
        EV.put(398.0, new treeMap("hyundai 45Kwh Battery", 398));

        for(Map.Entry<Double, treeMap> Evcars : EV.entrySet()){
            System.out.println("Key :" +Evcars.getKey()+ " ,Brand " +Evcars.getValue().BatteryPower +
                    " ,Mileage " +Evcars.getValue().Mileage);

        }

    }
}
