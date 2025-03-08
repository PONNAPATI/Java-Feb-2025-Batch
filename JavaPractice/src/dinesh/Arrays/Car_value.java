package dinesh.Arrays;

public class Car_value {
    public static void main(String[] args) {
        Class_oblect_method car = new Class_oblect_method();

        car.car_value = 5000;
        car.car_name = "Ford fusion";
        car.model_year = 2018;

        car.depreciation_value(550);// Calling a method from Class_object_method

        double Value = car.Current_car_value();
        System.out.println("The Value of car is: " + Value);

        car.Car_condition(); //
        //System.out.println("The car condition is " + car.Car_condition());

//        Double Tatalvalue = car.TotalValue_with_Extra_specs(1256.03);
//        System.out.println(Tatalvalue);

        Double Tatalvalue = car.TotalValue_with_Extra_specs_1();
        System.out.println(Tatalvalue);

    }
}
