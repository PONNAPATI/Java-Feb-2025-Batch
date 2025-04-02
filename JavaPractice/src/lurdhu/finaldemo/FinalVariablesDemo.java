package src.lurdhu.finaldemo;

public class FinalVariablesDemo {
    public static void main(String[] args) {
        final int max_attempts = 3;
        System.out.println("maximum attempts : " + max_attempts);

//        max_attempts = 5; // can not change as the variable is final
    }
}
