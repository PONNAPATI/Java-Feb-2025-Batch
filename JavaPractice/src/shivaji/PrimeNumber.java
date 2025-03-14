package shivaji;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for result");
        int i= sc.nextInt();
        boolean bb=true;
        for (int a=2;a<i/2;a++)
        {
            if (i%a==0)
            {
                bb=false;
            }
        }
        if (bb)
        {
            System.out.println(i+" is a prime number");
        }
        else {
            System.out.println(i+" is not a prime number");
        }
    }
}
