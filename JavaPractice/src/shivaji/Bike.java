package shivaji;

public class Bike {
    String brandName = "Honda";
    String plate = "SHIV";
    int weight = 150;

    Bike()
    {
        System.out.println(brandName);
    }
    void speed (int d,int t)
    {
        double s=(double) d/t;
        System.out.println(s);
    }

}
