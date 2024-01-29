import java.util.Scanner;

public class PyramidAndInvertedPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pyramid and inverted pyramid: ");
        int numRows = scanner.nextInt();
        scanner.close();

        System.out.println("Pyramid:");

        // Pyramid
        for (int i = 1; i <= numRows; i++) {
            // Print spaces before the pattern
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print("  ");
            }

            // Print ascending numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Print descending numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Move to the next line
            System.out.println();
        }

        System.out.println("Inverted Pyramid:");

        // Inverted Pyramid
        for (int i = numRows; i >= 1; i--) {
            // Print spaces before the pattern
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print("  ");
            }

            // Print ascending numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Print descending numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
