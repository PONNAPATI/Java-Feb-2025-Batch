package tharun.exceptionhandling;

public class TryCatch {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int z;
        try{
            z = x / y;
            System.out.println(z);
        }
        catch(ArithmeticException ae){
            System.out.println("division catch block");
        }
        finally{
            System.out.println("Finally block");
        }
    }
}
