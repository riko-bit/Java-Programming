import java.util.Scanner;

public class StringStartsWithCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        System.out.print("Enter the prefix to check for: ");
        String prefixToCheck = scanner.nextLine();

        boolean startsWith = mainString.startsWith(prefixToCheck);

        if (startsWith) {
            System.out.println("The main string starts with the specified prefix.");
        } else {
            System.out.println("The main string does not start with the specified prefix.");
        }

        scanner.close();
    }
}
