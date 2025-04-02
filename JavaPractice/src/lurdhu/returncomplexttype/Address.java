package src.lurdhu.returncomplexttype;

public class Address {

    private String streetName;
    private int houseNumber;
    private String pincode;

    public Address(String streetName, int houseNumber, String pincode) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.pincode = pincode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", houseNumber=" + houseNumber +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
