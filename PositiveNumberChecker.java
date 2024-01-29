import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class PositiveNumberException extends Exception {
    public PositiveNumberException(String message) {
        super(message);
    }
}

public class PositiveNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        try {
            checkForPositiveNumbers(filePath);
            System.out.println("No positive numbers found in the file.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (PositiveNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkForPositiveNumbers(String filePath) throws FileNotFoundException, PositiveNumberException {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException("The file does not exist.");
        }

        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNext()) {
                int number = Integer.parseInt(fileScanner.next());
                if (number > 0) {
                    throw new PositiveNumberException("Positive number found in the file: " + number);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format in the file.");
        }
    }
}
