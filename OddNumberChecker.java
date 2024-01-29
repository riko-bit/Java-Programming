import java.util.Scanner;

class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

public class OddNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        try {
            checkForOddNumber(number);
            System.out.println("The number is even.");
        } catch (OddNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkForOddNumber(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("Odd number found: " + number);
        }
    }
}
