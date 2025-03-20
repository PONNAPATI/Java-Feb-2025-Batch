package tharun.loops;

public class SumOfNumbers {
    public static void main(String[] args){
        int num = 20;
        int sum = 0;
        int i = 0;
        while(i <= num){
            sum += i;
            i++;
        }
        System.out.println("The sum is : " + sum);
    }
}
