package src.lurdhu.staticblock;

public class StaticBlockDemo {
    public static void main(String[] args) {
        Database d = new Database();

        String connection = d.getConnection();

        System.out.println(connection);


        // connection.save(Student);
        // connection.get(1);
    }
}
