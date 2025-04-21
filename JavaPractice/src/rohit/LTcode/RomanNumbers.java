package rohit.LTcode;

import java.util.HashMap;
import java.util.Map;

public class RomanNumbers {
    public static int romantoInt(String s)
    {

        Map<String, Integer> romanmap= new HashMap<>();
        romanmap.put("I", 1);
        romanmap.put("V", 5);
        romanmap.put("X", 10);
        romanmap.put("L", 50);
        romanmap.put("C", 100);
        romanmap.put("D", 500);
        romanmap.put("M",1000);

        int total =0;
        int previousvalue = 0;
        try {

            for (int i =s.length()-1; i>=0; i--)
        {


            int currentvalue = romanmap.get(String.valueOf(s.charAt(i)));

            if (currentvalue<previousvalue)
            {
                total= total-currentvalue;
            } else {
                total = total+currentvalue;
            }
            previousvalue= currentvalue;
        }
        }catch (NullPointerException e){
            System.out.println("Invalid "+s +" Roman numeral");
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println( romantoInt("98756"));
    }
}
