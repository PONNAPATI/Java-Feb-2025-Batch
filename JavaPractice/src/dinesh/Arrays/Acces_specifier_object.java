package dinesh.Arrays;

public class Acces_specifier_object {
    public static void main(String[] args) {
        Access_Specifier_house house = new Access_Specifier_house();
        Access_Specifier_house house1 = new Access_Specifier_house(577587979);
        boolean owner_marital_status = house.ispropertiermarried;
        System.out.println("is House owner married : " +owner_marital_status);

        String houseownername = house.Name_of_the_Propertier();
        System.out.println("Name of the house owner: " +houseownername);



        // To check the Overrided ToString value from Parent class
        System.out.println(house);

        //To Compares actual content (values) of objects irrespective of the stored address
        System.out.println(house.equals(house1));

        //Hashcode -- Generates a Unique Code for an Object and sometimes it could be same for various objects
        System.out.println(house.hashCode());





    }
}
