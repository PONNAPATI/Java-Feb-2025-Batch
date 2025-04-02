package dinesh.OOPS.INHERITANCE;

public class Driver_details extends Truck_counts {
    private int active_drivers = 35;
    private String Average_age_drivers;
    private Boolean do_they_have_female_drivers = true;
    private double Average_age_female_drivers;

    Driver_details(){
    }

    Driver_details(int drivers, String averareage){
        //super(Truck_company);
        this.active_drivers = drivers;
        this.Average_age_drivers = averareage;
    }

    public boolean WomenEmployees(){
        this.Average_age_female_drivers = 34.78;
        System.out.println("do_they_have_female_drivers " +do_they_have_female_drivers);
        System.out.println("Average_age_female_drivers " +Average_age_female_drivers);
        return true;
    }
}
