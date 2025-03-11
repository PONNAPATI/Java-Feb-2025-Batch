package src.lurdhu;

public class ExceptionDemo {
    public static void main(String[] args) {
        int output = 0;
        try {
            output = divide(10, 0);  // This piece of code might throw an exception and hence keeping it in try block

            // Below 4 lines wont be executed when exception occurs
            int m = 5;
            int n = 3;
            int l = m-n;
            System.out.println("Subtraction values is : " + l);
        } catch (Exception e) {  // This piece of code executed when exception occurs
            System.out.println("Exception has occurred but we are going to continue program execution : " + e.getMessage());
        }

        // Below piece of code executed when after exception occurs as we are handling exception using try-catch block
        int x = 20;
        int y = 5;
        int z = x*y;

        System.out.println("Multiplication result : " + z);
    }

    public static int divide(int a, int b){  // This method is static as main method is static. static method can call another static method only without object creation.
        int result = a/b;
        return result;
    }
}
