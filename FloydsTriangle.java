import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Floyd's Triangle: ");
        int numRows = scanner.nextInt();
        scanner.close();

        System.out.println("Floyd's Triangle:");

        int currentNumber = 1; // Initialize the current number to 1

        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNumber + " ");
                currentNumber++; // Increment the current number
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
