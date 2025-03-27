package dinesh.Collections.LIST;

import java.util.List;



public class ArrayList {

    public static void main(String[] args) {
        List<String> carBrands = new java.util.ArrayList<>();

        carBrands.add("TATA");
        carBrands.add(1,"SUZUKI");
        carBrands.addLast("BYD");// this will add this string to the last in the list
        carBrands.add("TOYOTA");
        carBrands.addLast("TATA");
        System.out.println("The famous car brands in india are: " +carBrands);
        carBrands.add(5,"SUZUKI");

        for (String CARBRANDS: carBrands){
            System.out.println(CARBRANDS);
        }

        carBrands.addFirst("hyundai"); // this will add Hyundai to first index in the list

        System.out.println("The famous car brands in india are: " +carBrands);

        System.out.println("Does the List contain SUZUKI " +carBrands.contains("SUZUKI"));// Check whether element is present in list

        System.out.println("The Size of the list is: "+ carBrands.size()); // Check and gives the size of the list

        System.out.println("The Index of BYD in list " +carBrands.indexOf("BYD")); //Print the index value or it prints -1.

        System.out.println("Finding the last index of element " +carBrands.lastIndexOf("TATA"));// it is used when you same element repeated in LIST and provides the last index of it

        System.out.println("Finding The first index of an SUZUKI " +carBrands.isEmpty());// Checks if the list is empty and return boolean

        System.out.println("The removing On of the duplicate or any element (i.e) TATA" +carBrands.remove("TATA") ); // It removes the first index of element.

        System.out.println("The famous car brands in india are: " +carBrands);

        System.out.println("Convert the CarBrands list to array " +carBrands.toArray()); //changing the List to array

        System.out.println(carBrands.toString()); // convert the hashcode into String value

        System.out.println(carBrands.stream().toList()); // convert from String to list

        carBrands.clear(); // It clear all the elements in the list

        System.out.println("After clearing all the element in the list it displays empty list or ARRAY "+ carBrands);

    }
}
