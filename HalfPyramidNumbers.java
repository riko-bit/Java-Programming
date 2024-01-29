import java.util.Scanner;

public class HalfPyramidNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the half pyramid: ");
        int numRows = scanner.nextInt();
        scanner.close();

        System.out.println("Half Pyramid of Numbers:");


        for (int i = 1; i <= numRows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
