import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;
public class ArrayTutorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arrayLen = sc.nextInt();
        int[] arr = new int[arrayLen];
        for(int i=0;i<arrayLen;i++){
           arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[arrayLen-1]);
    }
}
