package shivaji.CollectionDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsDemo {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("SHIVA");
        myList.add("Swathi");
        myList.add("Yash");
        System.out.println(myList);

        List<String> Llist = new LinkedList<>();
        Llist.add("ASDF");
        Llist.add("lkjh");
        System.out.println(Llist);

    }
}
