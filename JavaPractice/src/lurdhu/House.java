package src.lurdhu;

import java.util.Objects;

public class House {

    private int rooms;
    private String color;
    private boolean isBalconyAvailable;
    private double size;
    private Address address;

    public House(String color, double size) {
        this.color = color;
        this.size = size;
    }

    private double getSize(){  // private access specifier
        return size;
    }

    void getRoomDetails(){     // default access specifier
        getSize();  // accessible withing same class
    }


    protected void test2() {  // protected accesss specifier
        System.out.println("This is protected method");
    }

    public void test3(){
        System.out.println("This is public method");
    }

    @Override
    public String toString() {
        return "House{" +
                "rooms=" + rooms +
                ", color='" + color + '\'' +
                ", isBalconyAvailable=" + isBalconyAvailable +
                ", size=" + size +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        House house = (House) o;
        return rooms == house.rooms && isBalconyAvailable == house.isBalconyAvailable && Double.compare(house.size, size) == 0 && Objects.equals(color, house.color) && Objects.equals(address, house.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rooms, color, isBalconyAvailable, size, address);
    }
}
