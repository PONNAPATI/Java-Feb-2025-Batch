package dinesh.Collections.LIST.LinkedList;

import java.time.Year;
import java.util.List;

// List stores Duplicates
//linked list
public class LinkedList
{
    public static void main(String[] args) {
        List<Integer> ManufactureYear = new java.util.LinkedList<>();

        ManufactureYear.add(1968);
        ManufactureYear.add(1,1973);
        ManufactureYear.add(1982);
        ManufactureYear.add(1982); // List always stores duplicattes
        ManufactureYear.add(1984);
        ManufactureYear.add(1986);
        ManufactureYear.add(1988);
        ManufactureYear.addFirst(1965);
        System.out.println("The initial manufacture and Upgradation of models on following till " +ManufactureYear);

        System.out.println("Get the first element in the list " +ManufactureYear.getFirst() );

        System.out.println("get the last element in the list " +ManufactureYear.getLast());

        System.out.println("remove index 2 in the list [0],[1], [2] " +ManufactureYear.remove(2));

        System.out.println("Check the element in the list " +ManufactureYear.contains(1976));

        System.out.println("Add an element to the list " +ManufactureYear.add(1989));

        Year(ManufactureYear);

        System.out.println("Check the element in the list with double quotes in integer datatype " +ManufactureYear.contains("1967") );

        System.out.println("Last index of the element 1982  is "+ManufactureYear.lastIndexOf(1982)); // last index of elemnt used while duplicates

        System.out.println("remove first element in the list "+ManufactureYear.removeFirst());

        Year(ManufactureYear);

        System.out.println("Remove the last element in the list " +ManufactureYear.removeLast());

        /*for (Integer year : ManufactureYear){
            System.out.println(year);*/
        Year(ManufactureYear);
    }
    public static void Year (List<Integer> ManufactureYear){

        System.out.println("Printing Start");

        for (Integer year : ManufactureYear){
            System.out.println(year);
        }

        System.out.println("Printing ended");

    }


}
