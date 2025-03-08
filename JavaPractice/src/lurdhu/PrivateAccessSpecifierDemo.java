package src.lurdhu;

public class PrivateAccessSpecifierDemo {

    public static void main(String[] args) {
        House house = new House("Orange", 1200);
//        house.getSize();   // Not accessible because getSize() method is private
    }
}
