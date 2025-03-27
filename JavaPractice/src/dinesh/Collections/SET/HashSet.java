package dinesh.Collections.SET;

/*Set stores unique elements without duplicates.

Implementation classes of List interface
HashSet – Fast access, unordered
LinkedHashSet – Maintains insertion order
TreeSet – Sorted order

HashSet – Fast access, unordered
A HashSet stores elements in random order but ensures that all elements are unique*/

import java.util.LinkedHashSet;
import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        Set<Integer> numbers = new java.util.HashSet<>();

        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(8);
        numbers.add(9);
        numbers.add(5);// Does mot store duplicate.

        System.out.println("The numbers stored after without duplicates from Numbers set " +numbers);

        System.out.println("\n"+"The numbers stored after without duplicates from Numbers set: ");
        for (int Numbers : numbers){
            System.out.println(Numbers);
        }

        for (int i=0; i<=10; i++){
            if (numbers.contains(i)){
                System.out.println("The Number got place in the Hashset");
            }
            else{
                System.out.println("The number doesn't got place in the Hashset");
            }
        }
    }




}
