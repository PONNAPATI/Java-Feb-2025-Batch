package Arrays;

//Multi-Dimensional Array:
//Scenario: You have a small 2×3 grid of integers (2 rows, 3 columns). You’ll fill it with numbers and print it as a table.
public class NumbersGrid {
    public static void main(String[] args) {
        // Create a 2D array with 2 rows and 3 columns
        int[][] grid = new int[2][3];

        // Assign some values manually
        grid[0][0] = 1;
        grid[0][1] = 2;
        grid[0][2] = 3;
        grid[1][0] = 4;
        grid[1][1] = 5;
        grid[1][2] = 6;

        // Print the grid
        System.out.println("--- 2x3 Numbers grid ---");
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                System.out.print(grid[row][col] + " ");
            }
            System.out.println(); // Only break line after finishing the entire row
        }
    }
}

/*
Multi-Dimensional Arrays:
Represent rows and columns (e.g., grids or tables).
Access them with two indices: array[row][column].
*/
