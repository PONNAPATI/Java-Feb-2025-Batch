package dinesh.Arrays;

import java.util.Objects;

public class Access_Specifier_house {
    // Private specifiers accessible only inside the class

    /*Private: Only you (the owner) can access your personal diary in a locked drawer.
    Default (Package-Private): Your family can access items kept in the living room, but outsiders cannot.
    Protected: Relatives (your extended family) can access items in your backyard, but only if they have permission.
            Public: Anyone (friends, neighbours, or strangers) can access items in your front yard. */


    private int House_number;        // Private Variable cannot access outside the class

    private String Street_name;

    //private String Propertier_name = "Malinga";

    private String Propertier_name;

    private long Propertier_phone = 8463829202L;

    double Property_value = 256789.789;

    public boolean ispropertiermarried;

    //Start creating methods

    private void  Number_of_the_house(){   //Default method with return type
        this.House_number = 17;
        System.out.println("The House number of the propertier is " +House_number);
    }

    protected String Name_of_the_Propertier(){  //protected can be accessed inside the package
         //this.Propertier_name = "Mallinga";
        return Propertier_name = "Lasith";
    }

    public double value_of_the_Property(){
        return Property_value;

    }

    Access_Specifier_house(){

    }
    // Constructor with arguments
    Access_Specifier_house(long Propertier_phone){
        this.Propertier_phone = Propertier_phone;
    }

    @Override
    public String toString() {
        return "Access_Specifier_house{" +
                "House_number=" + House_number +
                ", Street_name='" + Street_name + '\'' +
                ", Propertier_name='" + Propertier_name + '\'' +
                ", Propertier_phone=" + Propertier_phone +
                ", Property_value=" + Property_value +
                ", ispropertiermarried=" + ispropertiermarried +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Access_Specifier_house that = (Access_Specifier_house) o;
        return House_number == that.House_number && Propertier_phone == that.Propertier_phone && Double.compare(Property_value, that.Property_value) == 0 && ispropertiermarried == that.ispropertiermarried && Objects.equals(Street_name, that.Street_name) && Objects.equals(Propertier_name, that.Propertier_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(House_number, Street_name, Propertier_name, Propertier_phone, Property_value, ispropertiermarried);
    }
}
