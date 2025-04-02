package src.lurdhu;

public class Empl {

    private String name;
    private int age;
    private double salary;

    public void updateSalary(double salary) {
        this.salary = salary;  // 1500
        // update salary in database
    }

    public double getSalary(){
        return salary + 5000;
    }

    public void saveSalary(double salary){
        this.salary = salary; // 1000
        // save in database
    }
}
