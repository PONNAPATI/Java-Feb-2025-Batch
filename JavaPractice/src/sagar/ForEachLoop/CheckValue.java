package ForEachLoop;

public class CheckValue {
    public static void main(String[] args) {
        //Arrays of numbers
        int [] numbers = { 10, 20, 30, 40, 50};
        int searchValue = 30; //  value to check
        boolean found = false;

        // Using for-each loop to check if value exists

        for (int num : numbers){
            if (num == searchValue){
                found = true;
                break; // Stop checking if found
            }
        }
        // Display result
        if (found){
            System.out.println(searchValue  + ": is in the array.");
        }else {
            System.out.println(searchValue + ": is not in the array");
        }
    }
}
