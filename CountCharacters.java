import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;

        sentence = sentence.toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isWhitespace(ch)) {
                spaces++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);

        scanner.close();
    }
}
