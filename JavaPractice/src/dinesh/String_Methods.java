package dinesh;

import java.util.Locale;

public class String_Methods {
    public static void main(String[] args) {
        String Java = " The Java sessions are R more interesting moving forward and the practice as well";

        //Index of
        //index(str)
        int indexof = Java.indexOf("int"); //index of particular string with first occurance
        System.out.println("index of INT: " +indexof);

        //indexof(Character,beginindex,endindex) or (String,beginindex,endindex)
//        int indexof_2 = Java.indexOf("are", 10, 40);//search for particular string from given starting index value to end index value
//        System.out.println("beginning and end index of char:" +indexof_2);

        //indexof(ch)
        int indexof_3 = Java.indexOf("r");  //index of particular character with first occurance(similar to string)
        System.out.println(indexof_3);

        //indexof (int ch, int indexof) or (String str, int indexof)
        int indexof_4 = Java.indexOf("e", 6);
        System.out.println("index 0f particular character with CH: " +indexof_4+"\n");



        //charAt()
        char charat = Java.charAt(5);
        System.out.println("charcter at the particular index: " +charat+"\n");



        //Concat
        // Concatting string to existing
        String concat = Java.concat("and also thanks"); // Concating string to existing
        System.out.println("Conacating a statement to existing string:" +concat);
        System.out.println(Java+"\n");



        //Concating new string to Existing string
        String Java_2 = "for your support and privilege  ";
        String concat_2_strings = Java.concat(Java_2);
        System.out.println("creating and Concating new string to Existing string " +concat_2_strings);
        System.out.println(Java+"\n");



        //equals() - compares two string, we can use written type boolean or compare directly at sout
        String Java_3 = "The Java sessions are R more interesting moving forward and the practice as well";
        boolean compare_strings = Java.equals(Java_3);
        System.out.println("comparing two strings by creating new variable " +compare_strings);            // method 1
        System.out.println("Comparing two strings directly without separate variable " +Java.equals(Java_2));       // method 2



        //Substring() -- The substring() method returns a substring from the string.
        System.out.println("Pulling substring of a string without variable " +Java.substring(8, 34));
        String Substring = Java_2.substring(8,25);
        System.out.println("Pulling a substring of a string by creating new varible " +Substring+"\n");



        // Uppercase
        System.out.println("Changing all the small letters in JAVA Variable to capital letters " +Java.toUpperCase(Locale.ROOT));
        System.out.println("Changing all the small letters in Java_2 to capital letters " +Java_2.toUpperCase());
        System.out.println(Java+"\n");



        //lower case
        System.out.println("Changing all the small letters in JAVA_2 Variable to small letters letters " +Java_2.toLowerCase());
        System.out.println("Changing all the small letters in JAVA Variable to small letters " +Java.toLowerCase()+"\n");



        //trim -- reduces the spaces in the starting and end of a sentence
        System.out.println("Trim or remove extra spaces in front and end of the statement in Java variable " +Java.trim());
        System.out.println("Trim or remove extra spaces in front and end of the statement in Java_2 variable " +Java_2.trim()+"\n");


        //replace -- replace a word in string with other word
        System.out.println("Replace R with '' spaces in java variable " +Java.replace("R", ""));
        System.out.println("replace e with Y in Java_2 variable " +Java_2.replace("e", "y")+"\n");


        //contains(Charsequence sequence)
        System.out.println("Checking a sequence is present in JAVA_2 variable without new variable: " +Java_2.contains("Java"));

        boolean contains = Java.contains("Java");
        System.out.println(("\n"+"Checking a word is available in Java Variable: " +contains+"\n"));


        //Starts wih and end with
        boolean Startendwith = Java.startsWith(" The");
        System.out.println("is Java starts with ' the': "+Startendwith);

        boolean endswith = Java.endsWith("ndn" );
        System.out.println("is Java ends with ' ndn': "+Startendwith);



    }
}
