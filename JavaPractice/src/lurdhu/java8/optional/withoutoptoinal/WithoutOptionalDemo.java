package src.lurdhu.java8.optional.withoutoptoinal;

import src.lurdhu.java8.optional.withoutoptoinal.UserDetails;

public class WithoutOptionalDemo {
    public static void main(String[] args) {
        UserDetails userDetails = new UserDetails();

        if(userDetails.getUserName() != null) {
            System.out.println(userDetails.getUserName().toUpperCase());
        } else {
            System.out.println("User name is null");
        }

    }
}
