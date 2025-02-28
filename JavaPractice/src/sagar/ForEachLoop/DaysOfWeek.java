package ForEachLoop;

public class DaysOfWeek {
    public static void main(String[] args) {
        // Arrays of days
        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturady", "Sunday"};

        //Using for-each loop to print each day

        for (String day : days) {
            System.out.println(day);
        }
    }
}
