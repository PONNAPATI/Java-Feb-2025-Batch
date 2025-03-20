package dinesh.OOPS.ENCAPSULATION;

import java.util.Scanner;

public class ENCAP_3 {
    private int age;

    private String Patient_name;

    private long Patient_phone;

    private boolean ispatient_diabetic;

    void Diabetic(){
        Scanner diabs = new Scanner(System.in);

        System.out.println("The age of the patient is ");
        int age = diabs.nextInt();

        if (age>=60){
            System.out.println("The Patient could be diabetic");
        }
        else;
        System.out.println("Run the tests to find the sugar level");
    }
    protected void phone(){
        this.Patient_phone = 272728829;
        System.out.println("\n"+"The phone_number of the patient is: " +Patient_phone);
    }

    /*public void name(String Patientname){
        this.Patient_name = Patientname;
        Scanner op_name = new Scanner(System.in);
        System.out.println("The name of the patient is: ");
        String PatPatient_name = op_name.toString();
    }*/

    public void name(){
        //this.Patient_name = Patientname;
        Scanner op_name = new Scanner(System.in);
        System.out.println("\n"+"The name of the patient is: ");
        String Patient_name = op_name.next();
        System.out.println("The name of the patient is " + Patient_name);
    }


}
