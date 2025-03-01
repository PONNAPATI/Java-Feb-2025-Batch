package dinesh;


public class Arithmetic_operators {
    public static void main(String[] args) {
        int roll_no = 38;
        int A = 37;
        int B = 35;

        String Name = "victor";
        float percentage = 78.87f;
        long phone = 72982737L;
        boolean is_he_boy = true;
// Logical Operators:
            // || - OR operator
            // && - AND operator
            // !  - Not operator(reverse the condition)

        //OR - execute any one condition is true
        if(roll_no == 38 || A<B) {

            System.out.println("the statement is true"+"\n" );
        }
        else{

            System.out.println("the statement is false"+"\n");
        }


        //AND - both the condition should work

        if(A<B && A==B){
            System.out.println("Both the condition is passed"+"\n");
        }
        else{
            System.out.println("the condition is not passed"+"\n");
        }


        //!(not) - reverse the declared statements

        if(!is_he_boy){
            System.out.println("he is not boy"+"\n");
        }
        else{
            System.out.println("yes he is boy"+"\n");
        }



// Assigment operators - =, +=, *=, =, -=, /=, %=
        int D = 34,E = 56,S=56, H= 87;

        D += 3;
        System.out.println("incremented +3 to D is:" +D+"\n");

        E -= 12;
        System.out.println("decremented -12 to E is:" +E+"\n");

        System.out.println(D==37);

        S *= 2;
        System.out.println("multiply 2 on S is:" +S);

        H /= 2;
        System.out.println("Divide by 2 on H:" +H);

        B %= 4;
        System.out.println("Remainder of B when divide by 4 is:" +B);



// Urinary opertors = +, -:   Positive/Negative.
//                    ++, --: Increment/Decrement.
//                    !:       Logical NOT.
        System.out.println(("\n"+"\n"+"Urinary operators"+"\n"));
        System.out.println(++A);// 38(directly prints 38 since it was pre-incremented
        System.out.println(A++); //takes 38 and increment 1 to it for 39
        System.out.println(--A); //now 39 was added to 40 and stores 40 in A
        System.out.println(A++); //now 40 in A will beacme 41 after post-increment
        System.out.println(A+"\n");



// Relational operators:Used to compare two values and return true or false
        // ==, !=, >, <, <=, >=
        System.out.println("IS A Greater than B:" +(A>B));
        System.out.println("do S is equal to 56:" +(S==56));
        System.out.println("do H is greater than or equal to 45:" +(H>=45));
        System.out.println("do E is less than or equal to 48:" +(E<=48));

        System.out.println("do H is less than D:" +(H<D));

    }

}
