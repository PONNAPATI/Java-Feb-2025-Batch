package tharun.enumkeyword;

public class EnumExample {
    public static void main(String[] args) {

        String input = "SUNDAY";
        Day day =  Day.valueOf(input);
        System.out.println("Day : " + day);


    // to check the position of a index in a list
//        System.out.println(Day.MONDAY.ordinal());

   }
}

