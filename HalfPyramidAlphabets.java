import java.util.Scanner;

public class HalfPyramidAlphabets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the half pyramid: ");
        int numRows = scanner.nextInt();
        scanner.close();

        System.out.println("Half Pyramid of Alphabets:");


        for (int i = 1; i <= numRows; i++) {

            char alphabet = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(alphabet + " ");
                alphabet++;
            }

            System.out.println();
        }
    }
}
