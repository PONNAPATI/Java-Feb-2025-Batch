package dinesh;
import java.util.Arrays;
public class Maths_In_Java {
    public static void main(String[] args) {
        //int[] num = {12, 67, 69, 53, 89, 63,87};
        //System.out.println(Math.max(num));

        //find the Maximum value in two numbers using math class
        int A = 23, B=45, C= 32, D= 125, E=78;
        int of_max = Math.max(A,B);
        System.out.println("Maximum value in two numbers using math class: "+of_max+"\n");


        //finding the minimum value in two numbers using math class
        int of_mininmum = Math.min(D,E);
        System.out.println("Minumum value in two numbers using math class: "+of_mininmum+"\n");



        //Finding the square root of number or two defined variable
        // in MAth Sqrt only takes value as double -- sqrt(double a)
        System.out.println("Square_Roots: ");
        int SQRT = (int) Math.sqrt(D); // we did narrow casting from sqrt(double) to convert it to Int
        System.out.println(" the Square root of value D: "+SQRT);

        System.out.println(" the Square root of value E: "+Math.sqrt(E));// else we can directly declare it in sout

        double sqrt = Math.sqrt(81);
        System.out.println(" the square root of 81: "+sqrt);

        System.out.println(" the square root of any value is: "+Math.sqrt(56));



        //Multiply or products of two values(*, Multiplyexact,multiplyfull)
        System.out.println("\n"+"Multiply or products of two values:");
        int product_1 = Math.multiplyExact(D,A);
        System.out.println(" Product of D&A with multiplyexact: "+product_1);

        System.out.println(" product of two variables with *: "+(D*E));

        System.out.println(" product of two random numbers: "+(4*6));



        // Power of values or variables(^, pow,)
        // power takes variable as double
        System.out.println("\n"+"Power of values or variables(^):");
        double power_of = Math.pow(A,D);
        System.out.println(" the power of A&D  is: "+ power_of);
        System.out.println(" the power of D&B is: "+ Math.pow(D,B));
        System.out.println(" the power of two numbers: "+ Math.pow(34,87));


        // Log valiues
        System.out.println("\n"+"The logvalues of Log, Log10,loglp: ");
        double log_of = Math.log(3536); // log is stored as double in math
        System.out.println("  The log value of 3536: " +log_of);

        System.out.println("  the log value of variable D is: "+Math.log(D));
        System.out.println("  the log value of random number: " +Math.log(5673));

          //Log10 values
        System.out.println("the Log10 values: ");
        double log_of_10 = Math.log10(388);
        System.out.println("  the log10 value of 388 is: "+log_of_10);

        System.out.println("  the log10 value of variable A is: "+ Math.log10(A));
        System.out.println("  the log10 value of random number is: "+ Math.log10(29438));
          //log1p values
        System.out.println("the Log1p values: ");
        double log_of_1p = Math.log1p(765);
        System.out.println("  the log1p value of 388 is: "+log_of_1p);

        System.out.println("  the log1p value of variable E is: "+ Math.log1p(E));
        System.out.println("  the log1p value of random number is: "+ Math.log1p(63723));
//       double log_1p = Math.log1p(D);
//       System.out.println(log_1p);


           //Random() -- store as double and prints random value between 0 and 1
        System.out.println("\n"+"Random Value: ");
        double random_of = Math.random();
        System.out.println("random_number between 0 & 1: " +random_of);
        System.out.println("random_number between 0 & 1: "+Math.random());


           //trignometry
        System.out.println("\n"+"the trignometric value of: ");
        double cos = Math.cos(3537);
        System.out.println(" The cos value of 3537 is: "+ cos);
        System.out.println(" the sin value of D is: " +Math.sin(-E));
        System.out.println(" the tanh value of 679: "+ Math.tanh(67));
        System.out.println(" the sinh value of D is: " +Math.sin(63));
        System.out.println(" the tan value of 679: "+ Math.tan(-6779));
        System.out.println(" The cosh value of 3537 is: "+Math.cosh(B));


          //Ceil - Returns the smallest (closest to negative infinity) double value
        double ceil = 3467.7890;
        System.out.println("\n"+" the ceil value of 3467.7890: "+Math.ceil(ceil));
        System.out.println(" the ceil value of random number"+Math.ceil(267.3978));


          //floor
        double floor = 363.789;
        System.out.println("\n"+" the floor value of 363.789: "+Math.floor(floor));
        System.out.println(" the floor value of random number:" +Math.floor(678.987));

        //round0f
        System.out.println("\n"+" the roundof value of random number: "+ Math.round(3638.787));


        }
    }
