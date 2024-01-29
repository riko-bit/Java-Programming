import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        Map<Character, Integer> charFrequency = new HashMap<>();


        sentence = sentence.toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (Character.isLetter(ch)) {

                charFrequency.put(ch, charFrequency.getOrDefault(ch, 0) + 1);
            }
        }


        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }

        scanner.close();
    }
}
