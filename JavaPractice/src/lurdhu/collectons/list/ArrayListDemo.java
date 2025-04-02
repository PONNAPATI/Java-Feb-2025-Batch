package src.lurdhu.collectons.list;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
//        List (interface)
//        ArrayList, LinkedList, Vector (classes)

//        int[] students = new int[5];
//        int[] stu = {1,2,3,4,5};

        List<String> myList = new ArrayList<>();

        // default size is 8
        // String[] myList = new String[8];
        // if (myList.size() is 80% defaultSize){   // myList.size = 10
             // they write a logic to increase the size of the array
             // String[] newArray = new String[myList.size() + 5]; // 10 + 5 = 15
             // newArray = myList;
        // }


        myList.add("Dinesh");
        myList.add("Sahithi");
        myList.add("Sagar");
        myList.add("Tharun");
        myList.add("Rohit");
        myList.add("Deepthi");
        myList.add("Shiva");





        myList.add("Sahithi");
        myList.add("Dinesh");
        myList.add("Guru");

        printListElements(myList);

        System.out.println("SIZE : "  + myList.size());
        System.out.println("Is List empty : "  + myList.isEmpty());
        System.out.println("get element at index 3 : "  + myList.get(3));
        System.out.println("check if list contains Rohit : "  + myList.contains("Rohit"));
        System.out.println("removing an element at 2nd index : "  + myList.remove(2));

        printListElements(myList);

        System.out.println("add new element at 4nd index : "  + myList.set(4, "Lurdhu"));

        printListElements(myList);

        System.out.println("getting sublist form 1st index to 4th index : "  + myList.subList(1, 4));



        System.out.println("getting index of specific object : " + myList.indexOf("Rohit"));

        System.out.println("getting last index of specific object : " + myList.lastIndexOf("Sahithi"));


        myList.clear();
        System.out.println("printing the list after clear()....");
        printListElements(myList);


    }

    public static void printListElements(List<String> list){
        System.out.println("----------- printing started");
        for(String element : list){
            System.out.println(element);
        }
        System.out.println("----------- printing ended");
    }
}
