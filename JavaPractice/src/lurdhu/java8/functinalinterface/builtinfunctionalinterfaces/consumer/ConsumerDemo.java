package src.lurdhu.java8.functinalinterface.builtinfunctionalinterfaces.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        List<String> userNames = Arrays.asList("John", "Thomas", "Vlad");

        Consumer<String> greet = usr -> System.out.println("Hello : " + usr);

//        for(String userName : userNames){
//            greet(userName);
//        }

        userNames.forEach(greet);
    }

//    public static void greet(String userName){
//        System.out.println("Hello : " + userName);
//    }
}
