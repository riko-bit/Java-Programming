import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class EmptyFileException extends Exception {
    public EmptyFileException(String message) {
        super(message);
    }
}

public class FileNotEmptyChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        try {
            checkFileNotEmpty(filePath);
            System.out.println("The file is not empty.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (EmptyFileException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkFileNotEmpty(String filePath) throws FileNotFoundException, EmptyFileException {
        File file = new File(filePath);

        if (!file.exists()) {
            throw new FileNotFoundException("The file does not exist.");
        }

        if (file.length() == 0) {
            throw new EmptyFileException("The file is empty.");
        }

        try (FileInputStream fis = new FileInputStream(file)) {
            int data;
            while ((data = fis.read()) != -1) {

            }
        } catch (IOException e) {

        }
    }
}
