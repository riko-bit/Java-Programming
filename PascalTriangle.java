import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's triangle: ");
        int numRows = scanner.nextInt();
        scanner.close();

        System.out.println("Pascal's Triangle:");

        int[][] triangle = generatePascalsTriangle(numRows);

        // Print the generated Pascal's triangle
        for (int i = 0; i < numRows; i++) {
            // Print spaces for formatting
            for (int j = 0; j < numRows - i; j++) {
                System.out.print("   ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.printf("%6d", triangle[i][j]);
            }

            System.out.println();
        }
    }

    public static int[][] generatePascalsTriangle(int numRows) {
        int[][] triangle = new int[numRows][];
        for (int i = 0; i < numRows; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }
        return triangle;
    }
}
