public class StringPoolProductCheck {
    public static void main(String[]args){

        String P1 = "iPhone15";
        String P2 = "iPhone15";
        String P3 = new String(("iPhone15"));

        System.out.println("P1 == P2: " + (P1 == P2));
        System.out.println("P1 == P3: " + (P1 == P3));
        System.out.println("P1.equals(P3): " + P1.equals(P3));
    }
}
