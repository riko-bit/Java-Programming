import java.util.ArrayList;
import java.util.Scanner;

public class StringInterleavings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();


        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        ArrayList<String> interleavings = new ArrayList<>();
        findInterleavings("", str1, str2, interleavings);

        System.out.println("The given strings are " + str1 + " " + str2);
        System.out.println("The interleaved strings are:");
        for (String interleave : interleavings) {
            System.out.println(interleave);
        }

        scanner.close();
    }


    public static void findInterleavings(String current, String str1, String str2, ArrayList<String> interleavings) {
        if (str1.isEmpty() && str2.isEmpty()) {
            interleavings.add(current);
            return;
        }

        if (!str1.isEmpty()) {
            findInterleavings(current + str1.charAt(0), str1.substring(1), str2, interleavings);
        }

        if (!str2.isEmpty()) {
            findInterleavings(current + str2.charAt(0), str1, str2.substring(1), interleavings);
        }
    }
}
