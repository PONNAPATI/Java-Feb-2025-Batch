public class RestaurantHours {
    public static void main(String[]args){
        int currentHour = 11;

//        if (!(currentHour >= 12 && currentHour <=24)){

        if (!(currentHour >= 12 && currentHour <=24)){
            System.out.println("The store is open");
        }else
            System.out.println("The store is closed");
    }
}


// if I use && operate the store is closed

// if I use || operate the store is Open

// if I use ! operate the store is Open