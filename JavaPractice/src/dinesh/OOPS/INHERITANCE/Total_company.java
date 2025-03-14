package dinesh.OOPS.INHERITANCE;

public class Total_company {
    public static void main(String[] args) {
        Driver_details detail = new Driver_details();

        int total_trucks =detail.Total_no_of_trucks(56);
        System.out.println("Total truck counts " +total_trucks+"\n");
        System.out.println("company accident records: " +detail.company_accident_records(true)+"\n");
        System.out.println( detail.WomenEmployees()+"\n");
        System.out.println("Active trucks on roads is " +detail.Active_trucks_on_road()+"\n");

        String company_name = detail.Company_name = "MSC Logistics";
        System.out.println("The name of the company is " +company_name);


    }


}
