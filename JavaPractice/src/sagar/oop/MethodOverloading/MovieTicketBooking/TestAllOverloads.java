package oop.MethodOverloading.MovieTicketBooking;

public class TestAllOverloads {
    public static void main(String[] args) {
        MovieTicketBooking booking = new MovieTicketBooking();
        // 1) Single ticket, default seat
        booking.bookTicket("The Chosen");

        // 2) Multiple tickets, default seat
        booking.bookTicket("Maname", 4);

        // 3) Multiple tickets, specify seat type
        booking.bookTicket("John Wick", 6, "Balcony");

        // 4) Multiple tickets, seat type + discount
        booking.bookTicket("Hulk", 2, "VIP", "PROMO2025");
    }
}
