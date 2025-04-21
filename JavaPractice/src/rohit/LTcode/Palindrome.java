package rohit.LTcode;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        int org=x;
        int reverse=0;
        while (x>0)
        {
            int temp=x%10;
            reverse = reverse *10+temp;
            x= x/10;
        }

        if (reverse==org)
            return true;
        else
        return false;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1781));
    }
}
