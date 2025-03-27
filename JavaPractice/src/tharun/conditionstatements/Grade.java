package tharun.conditionstatements;

public class Grade {
    public static void main(String[] args) {
        int marks = 35;

        if( marks >= 90){
            System.out.println("Grade A");
        } else if(marks >= 80 && marks <= 65) {
            System.out.println("grade B");
        }else if(marks >= 50 && marks <= 35){
            System.out.println("Grade C");
        }else{
            System.out.println("Grade F");
        }
    }
}
