import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DuplicateIntegerCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();

        System.out.print("Enter a list of integers separated by spaces: ");
        String input = scanner.nextLine();

        String[] integerStrings = input.split(" ");

        for (String integerString : integerStrings) {
            try {
                int num = Integer.parseInt(integerString);
                integerList.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + integerString + " is not a valid integer.");
            }
        }

        try {
            checkForDuplicates(integerList);
            System.out.println("No duplicates found.");
        } catch (DuplicateFoundException e) {
            System.out.println("Duplicate found: " + e.getDuplicateValue());
        }
    }

    static void checkForDuplicates(List<Integer> integerList) throws DuplicateFoundException {
        Set<Integer> set = new HashSet<>();

        for (int num : integerList) {
            if (!set.add(num)) {
                throw new DuplicateFoundException(num);
            }
        }
    }
}

class DuplicateFoundException extends Exception {
    private int duplicateValue;

    public DuplicateFoundException(int value) {
        duplicateValue = value;
    }

    public int getDuplicateValue() {
        return duplicateValue;
    }
}
