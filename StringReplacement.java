import java.util.Scanner;
import java.util.regex.*;

public class StringReplacement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original string: ");
        String originalString = scanner.nextLine();

        System.out.print("Enter the regular expression to match: ");
        String regex = scanner.nextLine();

        System.out.print("Enter the replacement string: ");
        String replacement = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(originalString);
        String replacedString = matcher.replaceAll(replacement);

        System.out.println("Modified string: " + replacedString);

        scanner.close();
    }
}
