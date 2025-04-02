package shivaji;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> ls = new LinkedList<>();
        ls.add("asdf");
        ls.add("zxcvb");
        ls.add("mnbv");
        ls.add("qwerty");
        Iterator<String> it = ls.iterator();
        Collections.sort(ls);

        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
