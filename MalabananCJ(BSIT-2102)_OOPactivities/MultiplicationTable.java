import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        // Ask the user for the size of the multiplication table
        try (Scanner scanner = new Scanner(System.in)) {
            // Ask the user for the size of the multiplication table
            System.out.print("Enter the size of the multiplication table: ");
            int size = scanner.nextInt();
            
            // Create and populate the multiplication table
            int[][] table = new int[size][size];
            for (int i = 1; i <= size; i++) {
                for (int j = 1; j <= size; j++) {
                    table[i - 1][j - 1] = i * j;
                }
            }   // Print the multiplication table
            System.out.println("\nMultiplication Table:");
            for (int i = 1; i <= size; i++) {
                for (int j = 1; j <= size; j++) {
                    System.out.printf("%4d", table[i - 1][j - 1]); // Format the output for alignment
                }
                System.out.println(); // Move to the next row
            }
            // Close the scanner
        }
    }
}
