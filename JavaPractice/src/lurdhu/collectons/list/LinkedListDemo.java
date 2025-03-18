package src.lurdhu.collectons.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> myList = new LinkedList<>();

        myList.add("Rajesh");
        myList.add("Nirjhar");
        myList.add("Raghu");
        myList.add("Alok");

        LinkedListDemo linkedListDemo = new LinkedListDemo();
        linkedListDemo.print(myList); // Rajesh, Nirjhar, Raghu, Alok

        myList.remove(2);
        linkedListDemo.print(myList); // Rajesh, Nirjhar, Alok

        myList.add("Kunal");
        linkedListDemo.print(myList); // Rajesh, Nirjhar, Alok, Kunal

        myList.add(2, "Guru");
        linkedListDemo.print(myList); // Rajesh, Nirjhar, Guru, Alok, Kunal


    }

    public void print(List<String> myList){
        System.out.println("-----start-------");
        for(String element: myList) {
            System.out.println(element);
        }
        System.out.println("-----end-------");
    }
}
