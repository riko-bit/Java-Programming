import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}

public class DuplicateNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();

        System.out.print("Enter a list of integers (separated by spaces): ");
        String input = scanner.nextLine();
        String[] numberStrings = input.split(" ");

        for (String numStr : numberStrings) {
            try {
                int num = Integer.parseInt(numStr);
                if (numbers.contains(num)) {
                    throw new DuplicateNumberException("Duplicate number found: " + num);
                }
                numbers.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid integers.");
            } catch (DuplicateNumberException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("No duplicate numbers found.");
    }
}
