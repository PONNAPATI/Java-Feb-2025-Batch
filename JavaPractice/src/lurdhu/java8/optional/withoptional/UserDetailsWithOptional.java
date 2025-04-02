package src.lurdhu.java8.optional.withoptional;

import src.lurdhu.java8.methodreference.Student;

import java.util.Optional;

public class UserDetailsWithOptional {

    public Optional<String> getUserName() {
        // Gets the username from database by making a call to database
        // Assume that the database is giving null for the username and same null is returned to the caller
        return Optional.ofNullable(null);
    }
}
