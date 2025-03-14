package src.lurdhu.staticblock;

public class Database {
    private static String connection;

    static {
        // establish connection to the DB and store connection details in the above connection variable
        System.out.println("This is static block");
        connection = "This is test database connection";
    }

    Database(){
        System.out.println("This is no args/parameter constructor");
    }

    public String getConnection(){
        return connection;
    }
}
