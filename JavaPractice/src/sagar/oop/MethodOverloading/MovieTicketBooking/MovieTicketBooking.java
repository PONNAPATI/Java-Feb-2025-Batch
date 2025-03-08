package oop.MethodOverloading.MovieTicketBooking;

public class MovieTicketBooking {
    // Overload #1: Book a basic ticket for a single person, default seat type
    public void bookTicket(String movieName) {
        System.out.println("Ticket Booked for: " + movieName + " | Seat: Standard | 1 ticket.");
    }
    // Overload #2: Book multiple tickets, default seat type
    public void bookTicket(String movieName, int numberOfTickets) {
        System.out.println("Ticket booked for: " + movieName + " | Seat: Standard | " + numberOfTickets + "tickets.");
    }
    // Overload #3: Book multiple tickets with a specified seat type
    public void bookTicket(String movieName, int numberOfTickets, String seatType) {
        System.out.println("Ticket booked for:" + movieName + " | Seat: " + seatType + " | " + numberOfTickets + "tickets.");
    }
    // Overload #4: Book multiple tickets with seat type + discount code
    public void bookTicket(String movieName, int numberOfTickets, String seatType, String discountCode){
        System.out.println("Ticket booked for: " + movieName
        + " | Seat: " + seatType
        + " | " + numberOfTickets + "tickets"
        + " | Discount: " + discountCode);
    }
}
