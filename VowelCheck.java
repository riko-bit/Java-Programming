import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            checkForVowels(input);
            System.out.println("The input string contains vowels.");
        } catch (NoVowelsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    static void checkForVowels(String str) throws NoVowelsException {
        if (!str.matches(".*[aeiouAEIOU].*")) {
            throw new NoVowelsException("The input string does not contain any vowels.");
        }
    }
}

class NoVowelsException extends Exception {
    public NoVowelsException(String message) {
        super(message);
    }
}
