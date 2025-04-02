package shivaji;

import java.util.Scanner;

public class WhileLoopDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i= sc.nextInt();

        while (i<5)
        {
            System.out.println(i);
            i++;
            if (i>5)
            {
                break;
            }

        }
    }
}
