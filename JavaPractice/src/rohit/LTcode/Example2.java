package rohit.LTcode;

public class Example2 {
    public static void main(String[] args) {
        Example2 example2= new Example2();

        System.out.println(example2.addTwoNumbers("342","465"));

    }
    public String addTwoNumbers(String s1, String s2) {

        String reversed1 = new StringBuilder(s1).reverse().toString();
        String reversed2 = new StringBuilder(s2).reverse().toString();

        int sum = Integer.parseInt(reversed1)+Integer.parseInt(reversed2);
        String sumtostring=String.valueOf(sum);
        String sumreverse = new StringBuilder(sumtostring).reverse().toString();

        return sumreverse;
    }
}
