import java.util.Scanner;

public class InvertedFullPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the inverted full pyramid: ");
        int numRows = scanner.nextInt();
        scanner.close();

        System.out.println("Inverted Full Pyramid:");

        for (int i = numRows; i >= 1; i--) {
            // Print spaces before asterisks
            for (int j = numRows - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Print asterisks
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
