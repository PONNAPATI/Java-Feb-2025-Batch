package dinesh.Condition_statements;

public class For_loop {
    public static void main(String[] args) {
        // Print 1 to 10
        int w;
        System.out.println("The numbers between 1 to 10: ");
        for (w=1;w<=10;w++){
            System.out.print(w+ " ");
        }

        // Print even numbers between 1 and 40
        int E;
        System.out.println("\n"+"\n"+"The Even Numbers between: ");
        for(E=1;E<=20;E += 2){
            System.out.print(E+ " ");
        }

        // Print 10 down to 1

        int F;
        System.out.println("\n"+"\n"+"The numbers from 10 to 1: ");
        for (F=10;F>=1;F -= 1){
            System.out.print(F+ " ");
        }

        //Calculate odd numbers between 1 to 50.
        int T;
        int odd_numbers = 0;
        System.out.println("\n"+"\n"+"the sum of odd numbers from 1 to 50: ");
        for(T=1;T<=50;T += 2){
            //odd_numbers += T;
            System.out.print(T + " "+"\n");
        }
        //System.out.println("the sum of odd numbers from 1 to 50: "+ odd_numbers);
        int D;
        String [] Employee_details = {"ID : 3838", "Name : manoj", "Experience : 7.8", "Current salary : 45LPA", "Expertise : Java", "Team : New Accounts Verification"};
        System.out.println("\n"+"The Employee Details are: ");
        for (String employee : Employee_details){
            System.out.println(employee);

        }



    }
}
