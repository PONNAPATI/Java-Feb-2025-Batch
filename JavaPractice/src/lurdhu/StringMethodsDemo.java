package src.lurdhu;

public class StringMethodsDemo {
    public static void main(String[] args) {
        String str1 = "Arjun";
        String str2 = "Jay";
        String str3 = " my test ";

        String str4 = "programming";

        System.out.println(str1.length());
        System.out.println(str1.concat(str2));


        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

        System.out.println(str3.length());
        System.out.println(str3.trim().length());


        System.out.println(str4.substring(0,7));
        System.out.println(str4.replace('m','n'));
    }
}
