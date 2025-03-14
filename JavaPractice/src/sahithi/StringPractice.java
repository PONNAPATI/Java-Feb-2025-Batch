import java.util.*;
public class StringPractice {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println("total number of letters are: "+(A.length()+B.length()));
        if(A.compareTo(B)>0){
            System.out.println("Yes, String1 is greater");
        }
        else{
            System.out.println("No, String1 is not greater");
        }
        String capital = A.substring(0,1).toUpperCase()+A.substring(1)+" "+ B.substring(0,1).toUpperCase()+B.substring(1);

        System.out.println("By making the first letter capital we get:"+ capital);

    }
}
