package dinesh.Condition_statements;

import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        int day = 3;
        String name_of_day;
        switch (day){
            case 1:
                name_of_day = "Monday";
                break;

            case 2:
                name_of_day = "Tuesday";
                break;

            case 3:
                name_of_day = "wednesday";
                break;

            case 4:
                name_of_day = "Thursday";
                break;

            case 5:
                name_of_day = "Friday";
                break;

            case 6:
                name_of_day = "Saturday";
                break;

            case 7:
                name_of_day = "Sunday";
                break;

            default:
                name_of_day = "invalid day";
                break;

        }
        System.out.println(name_of_day);


        //Nested switch
        // Check year and branch with swithcses
        int year = 2;
        String branch = "ECE";

        switch (year){
            case 2:
                year = 2;
                System.out.println("Eligible to take electives");
                //break;

            case 3:
                switch (branch){
                    case "CSE":
                        System.out.println("elective courses : Machine Learning, Programming structures");
                    break;

                    case "EEE":
                        System.out.println("Elective courses : volatges and Circuits in Adapters");
                    break;

                    case "ECE":
                        System.out.println("Elective courses : Electronic Circuits, computer architecture");
                    break;
                    default:
                        System.out.println("May be not Engineering courses");
                }


        }

        //Using Variable in Switch Argument with scanner class
        //The switch argument can be a variable expression but the case labels must be constant expressions.
        //int r = 27;
        Scanner expession = new Scanner(System.in);

        System.out.println("The Value of r in switch: ");
        int r = expession.nextInt();
        switch (r+3){
            case 2:
                System.out.println("r swith value is 27");
            break;

            case 17:
                System.out.println("r switch value is 17");
            break;

            default:
                System.out.println("r switch value is not posiible in switch case");

        }
    }

}
