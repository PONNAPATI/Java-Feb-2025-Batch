package dinesh.Arrays;
// finding the value of the car after depreciating  value and also with extra specs
public class Class_oblect_method {
    //public static void main(String[] args) {
    String car_name;
    double car_value;
    int model_year;

    //Creating a method for find depreciation value
    void depreciation_value(double depreciate_value) {  //since it is number type we are assigning it to double
        System.out.println("The depreciate value of car is " + depreciate_value);

        double current_value = car_value - depreciate_value; // finding current value after depreciation
        System.out.println("The current value of car id " + current_value);
        car_value = current_value; // assigning the car value to current value
    }

    double Current_car_value() {
        return car_value;
    }

    boolean Car_condition() {
        System.out.println("The car condition is good ");
        return true;
    }

    /*double TotalValue_with_Extra_specs(double extra_specs){
        System.out.println("The invested amount for extra_specs : " +extra_specs);
        double total_value = car_value + extra_specs;
        car_value = total_value;

        return car_value;*/
    //}
    double TotalValue_with_Extra_specs_1() {
        //System.out.println("The invested amount for extra_specs : " +extra_specs);
        double total_value = car_value + 250;
        car_value = total_value;

        return car_value;

    }
}