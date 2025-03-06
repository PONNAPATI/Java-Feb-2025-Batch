package src.rohit;

import src.lurdhu.House;

public class PublicAccessSpecifierDemo {

    public void test(){
        House house = new House("Orange", 1200);

//        house.getSize(); // can not be accessible since its private
//        house.getRoomDetails() // can not be accessible since its default
//        house.test2()  // can not be accessible since its protected
          house.test3();  // able to access since its public
    }
}
