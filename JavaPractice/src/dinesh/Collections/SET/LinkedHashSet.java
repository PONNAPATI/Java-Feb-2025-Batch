package dinesh.Collections.SET;

/*Implementation classes of List interface
HashSet – Fast access, unordered
LinkedHashSet – Maintains insertion order
TreeSet – Sorted order*/

//A LinkedHashSet maintains insertion order while ensuring uniqueness

import java.util.Arrays;
import java.util.ServiceConfigurationError;
import java.util.Set;

public class LinkedHashSet {
    public static void main(String[] args) {
        LinkHashSet();

    }
    public static void LinkHashSet(){

        //Create a array with Duplicate Elements
        String [] DensePopulatedStates = {"UttarPradesh", "Bihar", "Delhi", "Rajasthan", "UttarPradesh", "Delhi", "Punjab"};

        //Create Linked Hash set to an Array to remove duplicates
        Set<String> RemoveDuplicates_in_Set = new java.util.LinkedHashSet<>(Arrays.asList(DensePopulatedStates));

        //Converting back to the Linked Hash set String to Array
        String[] array_without_duplicates = RemoveDuplicates_in_Set.toArray(new String[0]);

        //Print the string array without duplicates
        System.out.println(Arrays.toString(array_without_duplicates));
    }
    //String [] DensePopulatedStates = {"UttarPradesh", "Bihar", "Delhi", "Rajasthan", "UttarPradesh", "Delhi", "Punjab"};

    //Set<String> RemoveDuplicates_in_Set = new java.util.LinkedHashSet<>(Arrays.asList(DensePopulatedStates));



}
