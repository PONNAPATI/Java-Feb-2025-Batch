package src.lurdhu.collectons.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("John");
        names.add("Thomas");
        names.add("Nikki");
        names.add("Vlad");

        Iterator<String> elements = names.iterator();

        while(elements.hasNext()){
            String name = elements.next();
            System.out.println(name);
            elements.remove(); // This line will NOT throw ConcurrentModificationException when multiple thread are accessing the same piece of code
        }


//        for(String name:names){
//            System.out.println(name);
//            names.remove(name); // This line will throw ConcurrentModificationException when multiple thread are accessing the same piece of code
//        }
    }
}
