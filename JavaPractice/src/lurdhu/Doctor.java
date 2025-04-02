package src.lurdhu;

public class Doctor {
    String name;

    Doctor(String name){
        this.name = name;
    }

    Doctor getDoctor(){
        return this;
    }

    void consult(){
        System.out.println("Consulted the doctor");
    }


    public static void main(String[] args) {
        Doctor doc = new Doctor("Tharun");  // object creation

        doc.getDoctor();
        doc.consult();
    }
}
