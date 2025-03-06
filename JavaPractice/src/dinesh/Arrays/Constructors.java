package dinesh.Arrays;

public class Constructors {
     String truck;

    int Truck_count;

    String Driver_name;

    int Driver_age;

    boolean Driver_fit;

     void DriverDetails(double age){
         System.out.println("The name of the driver: " + Driver_name);
         System.out.println("The age of the driver: " + age);
     }
     Constructors(){
         System.out.println("The Basic Default constructor");
     }

     Constructors(String truck, int Driver_age, boolean is_that_male){
          this.Driver_age =Driver_age;
          //this.truck = truck;
          truck = truck;
          this.Driver_fit = is_that_male;
         System.out.println("The name of the driver: "+truck +"\n"+ "The age of the driver "+Driver_age +"\n"+"Is he male: "+ is_that_male);
     }
    /* int Model_year;
     String Model_name;
     Boolean Is_that_petrol;

     void car(int model_year, String model_name, Boolean is_that_petrol ){
         Model_year = model_year;
         Model_name = model_name;
         Is_that_petrol = is_that_petrol;*/
}
