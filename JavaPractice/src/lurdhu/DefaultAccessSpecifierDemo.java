package src.lurdhu;

public class DefaultAccessSpecifierDemo {
    public static void main(String[] args) {
        House house = new House("Orange", 1200);
        house.getRoomDetails(); // able to access method with default access specifier
    }
}
