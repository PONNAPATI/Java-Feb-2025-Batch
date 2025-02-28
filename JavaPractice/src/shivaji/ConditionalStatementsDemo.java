package shivaji;

public class ConditionalStatementsDemo {
    public static void main(String[] args) {
        int i=5;

        if(i%2==0)
        {
            System.out.println(i+" is a even number");
        }
        else
        {
            System.out.println(i+" is an odd numer");
        }

        //-----------------------------------------

        int j=25;
        if (j%2==0)
        {
            System.out.println(j+" it is divisible by 2");
        } else if (j%3==0) {
            System.out.println(j+" it is divisible by 3");

        }
        else {
            System.out.println(j+" it won't divisible by 2 or 3");
        }
    }
}
