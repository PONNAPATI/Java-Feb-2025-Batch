package src.lurdhu;

public class ElseIfLadderDemo {
    public static void main(String[] args) {
        int marks = 45;

        if (marks > 90){
            System.out.println("A Grade Student");
        } else if (marks > 80 && marks < 90 ){
            System.out.println("B Grade Student");
        } else if (marks > 60 && marks < 80) {
            System.out.println("C Grade Student");
        } else {
            System.out.println("Student is failed...");
        }
    }
}
