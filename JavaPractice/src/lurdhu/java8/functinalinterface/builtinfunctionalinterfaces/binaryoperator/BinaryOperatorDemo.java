package src.lurdhu.java8.functinalinterface.builtinfunctionalinterfaces.binaryoperator;


import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

//        int sum = 0;
//        for(Integer ele : numbers) {
//            sum = sum + ele;
//        }

        BinaryOperator<Integer> sumTheElements = (a, b) -> a+b;
        int sum = numbers.stream().reduce(0, sumTheElements);

        System.out.println("Sum is : " + sum);
    }
}
