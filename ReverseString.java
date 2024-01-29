import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String inputString = scanner.nextLine();
        String reversedString = reverseString(inputString);

        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }

    public static String reverseString(String input) {
        int length = input.length();
        StringBuilder reversed = new StringBuilder();

        for (int i = length - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
    }
}
