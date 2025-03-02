package Arrays;

public class MultiDimensionCinemaTheater {
    public static void main(String[] args) {
        // Let's say we have 5 rows and 8 seats (columns) in each row.
        boolean[][] seats = new boolean[5][8];

        // Initialize all seats to 'true' (meaning they are available)
        for (int row = 0; row < seats.length; row++) {
            for (int col = 0; col < seats[row].length; col++) {
                seats[row][col] = true;
            }
        }

        // Mark one seat as booked (row 2, column 3)
        // Remember indexes are 0-based, so this is actually the 3rd row, 4th seat in that row.
        seats[2][3] = false;

        // Print the seat map in a grid layout
        // We'll use '[O]' for available (true) and '[X]' for booked (false).
        System.out.println("------ Cinema Seating Chart ------ ");
        for (int row = 0; row < seats.length; row++) {
            // For each row, print each seat on the same line
            for (int col = 0; col < seats[row].length; col++) {
                String seatSymbol = seats[row][col] ? "[O]" : "[X]";
                // Use 'print' instead of 'println' to stay on the same line
                System.out.print(seatSymbol + " ");
            }
            // After finishing one row, move to the next line
            System.out.println();
        }
    }
}
