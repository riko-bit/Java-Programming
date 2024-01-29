import java.util.Scanner;

public class DivideStringIntoParts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the number of parts: ");
        int numParts = scanner.nextInt();

        if (numParts <= 0) {
            System.out.println("Number of parts should be greater than 0.");
        } else if (numParts > inputString.length()) {
            System.out.println("Number of parts should not exceed the string length.");
        } else {
            String[] parts = divideString(inputString, numParts);

            System.out.println("The string divided into " + numParts + " parts and they are:");
            for (String part : parts) {
                System.out.println(part);
            }
        }

        scanner.close();
    }

    public static String[] divideString(String str, int numParts) {
        int length = str.length();
        int partSize = length / numParts;
        String[] parts = new String[numParts];

        for (int i = 0; i < numParts; i++) {
            int start = i * partSize;
            int end = (i == numParts - 1) ? length : (i + 1) * partSize;
            parts[i] = str.substring(start, end);
        }

        return parts;
    }
}
