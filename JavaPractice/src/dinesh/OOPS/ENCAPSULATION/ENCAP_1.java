package dinesh.OOPS.ENCAPSULATION;

public class ENCAP_1 {
    // Check the length of phone number
    private long Phone_number; // Here

    void length_of_string(long phone_number){
        this.Phone_number = phone_number;
        if(Phone_number==10){
            System.out.println("The phone number is valid");
        }
        else;
        System.out.println("It is an invalid dial number");
    }


    public long getPhone_number() {
        return Phone_number;
    }

    public void setPhone_number(long phone_number) {

        this.Phone_number = phone_number;
        if(Phone_number==10){ // Again he have to declare a condition since set is also new method
            System.out.println("The phone number is valid");
        }
        else;
        System.out.println("It is an invalid dial number");
    }
}
