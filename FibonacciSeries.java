import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int numTerms = scanner.nextInt();
        scanner.close();

        System.out.println("Fibonacci Series:");


        int firstTerm = 0, secondTerm = 1;


        System.out.print(firstTerm + " " + secondTerm + " ");


        for (int i = 2; i < numTerms; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
