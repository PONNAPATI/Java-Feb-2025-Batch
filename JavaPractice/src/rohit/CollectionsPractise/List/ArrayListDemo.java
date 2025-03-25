package rohit.CollectionsPractise.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<String> arraylist = new ArrayList<>();
        arraylist.add("Borra");
        arraylist.add("Venkata");
        arraylist.add("Rohith");
        arraylist.add("Krishna");

        for (String arr:arraylist)
        {
            System.out.println(arr);
        }
        System.out.println(arraylist.size());


    }
}
