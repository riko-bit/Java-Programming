import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the inverted half pyramid: ");
        int numRows = scanner.nextInt();
        scanner.close();

        System.out.println("Inverted Half Pyramid:");


        for (int i = numRows; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println("Inverted Half Pyramid of Numbers:");


        for (int i = numRows; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
