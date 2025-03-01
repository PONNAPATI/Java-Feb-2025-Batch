package dinesh;

import java.util.Collection;
import java.util.Scanner;

public class If_Ifelse_Nestedif {
    public static void main(String[] args) {

        /*Write a Java program to solve quadratic equations (use if, else if and else).

        Test Data
        Input a: 1
        Input b: 5
        Input c: 1*/

        // we need to implement Scanner input for user input

        Scanner input = new Scanner(System.in);
        //double result = b * b - 4.0 *  a * c;

        System.out.println("Input a: ");
        double a = input.nextDouble();
        System.out.println("Input b: ");
        double b = input.nextDouble();
        System.out.println("Input c: ");
        double c = input.nextDouble();

        double result = b * b - 4.0 *  a * c;

        if (result>0){
            double result_1 = -b + Math.pow(result,0.5)/2*a;  // 0.5 indicates square root on power
            double result_2 = -b - Math.pow(result,0.5)/2*a;
            System.out.println("The root value of quadratic equation for Result_1 " +result_1+ " and Result_2 "+result_2);
        } else if (result <= 0) {
            double result_1 = -b / 2 * a;
            System.out.println("The value of quadratic equation is: " +result_1);
        }
        else {
            System.out.println("The Quadratic equation has no real roots");
        }




        //Write a Java program that takes three numbers from the user and prints the greatest number.
        int A=45, B=56, C= 89;
        int largest = Math.max(Math.max(A,B),C);
        System.out.println("The largest of three numbers is " +largest);

                                //(or)

        //Java program that takes three numbers using if else
        //int[] LOT = {1,3,5,6,7};
        if(A>B){
            if(A>C){
                System.out.println("A is the greatest of three and number is " +A);
            }
        } else if(B>A){
            if(B>C){
                System.out.println("B is the greatest of three and the number is " +B);
            }
        }
        else if(C>A){
            if(C>B){
                System.out.println("c is the greatest of three and the number is " +C);
            }
        }
    }


}

