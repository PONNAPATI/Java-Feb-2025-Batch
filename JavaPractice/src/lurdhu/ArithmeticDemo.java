package src.lurdhu;

public class ArithmeticDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int c = 30, d = 40;
        int m = 70;
        int n = 60;

        if (a < b || c > d) {    // true || false   if(true)
            System.out.println("This is if block OR(||) demo");
        } else {
            System.out.println("This is else block OR(||) demo");
        }

        boolean isStudentActive = true;

        if(!isStudentActive) {
            System.out.println("Student is active");
        }
    }
}

//true && true = true
//true &&  false = false
//false &&  true = false
//false && false = false


//true || true = true
//true ||  false = true
//false ||  true = true
//false || false = false
