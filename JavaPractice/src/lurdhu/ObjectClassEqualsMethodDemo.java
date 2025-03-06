package src.lurdhu;

public class ObjectClassEqualsMethodDemo {
    public static void main(String[] args) {
        House house1 = new House("Orange", 1200);
        House house2 = new House("Orange", 1203);

        System.out.println("Are these objects equal? :" + house1.equals(house2));  // first checks hashcode comparison and then checks .equals() comparison
    }
}
