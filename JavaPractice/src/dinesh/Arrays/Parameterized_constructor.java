package dinesh.Arrays;

public class Parameterized_constructor {
    int Model_year;
    String Model_name;
    boolean Is_that_petrol = false;

    Parameterized_constructor(String model_name,int model_year,  Boolean is_that_petrol) {// parameterised Constructor
        Model_year = model_year;
        Model_name = model_name;
        Is_that_petrol = is_that_petrol;
        System.out.println(Is_that_petrol);
    }

    Parameterized_constructor(int model_year) {
    Model_year = model_year;
   }

    private void car_details(){ // Method
        System.out.println("The brand name of the car is: " +Model_name);
        System.out.println("The Manufactured year of the car is: " +Model_year);
        System.out.println("Do the car is petrol variant " +Is_that_petrol);
    }

    //Using "This" Keyword to call the constructor
    Parameterized_constructor() {
        this("BMW", 2822, true); //
    }

//    Parameterized_constructor(){
//        this(1988)
//    }

    public static void main(String[] args) {
        Parameterized_constructor Car_Details = new Parameterized_constructor("BMW", 1988, false);
        Car_Details.car_details(); // calling the Method name aligned with constructor
        //this("BMW", 2822, true);
    }
}
