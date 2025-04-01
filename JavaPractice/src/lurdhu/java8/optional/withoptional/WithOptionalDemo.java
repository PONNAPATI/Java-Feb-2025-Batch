package src.lurdhu.java8.optional.withoptional;

import src.lurdhu.java8.optional.withoptional.UserDetailsWithOptional;

public class WithOptionalDemo {
    public static void main(String[] args) {
        UserDetailsWithOptional userDetails = new UserDetailsWithOptional();

        System.out.println(userDetails.getUserName()
                .map(ele -> ele.toUpperCase())
                .orElse("User name is null"));

    }
}
