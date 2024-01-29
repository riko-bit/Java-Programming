import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SecondMostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        char secondMostFrequent = findSecondMostFrequentCharacter(inputString);

        if (secondMostFrequent != '\0') {
            System.out.println("The second most frequent character is: " + secondMostFrequent);
        } else {
            System.out.println("No second most frequent character found.");
        }

        scanner.close();
    }

    public static char findSecondMostFrequentCharacter(String str) {
        if (str == null || str.isEmpty()) {
            return '\0';
        }

        Map<Character, Integer> characterCount = new HashMap<>();


        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                characterCount.put(c, characterCount.getOrDefault(c, 0) + 1);
            }
        }

        char mostFrequent = '\0';
        char secondMostFrequent = '\0';

        int maxCount = 0;
        int secondMaxCount = 0;

        for (Map.Entry<Character, Integer> entry : characterCount.entrySet()) {
            int count = entry.getValue();
            char character = entry.getKey();

            if (count > maxCount) {
                secondMaxCount = maxCount;
                maxCount = count;
                secondMostFrequent = mostFrequent;
                mostFrequent = character;
            } else if (count > secondMaxCount) {
                secondMaxCount = count;
                secondMostFrequent = character;
            }
        }

        return secondMostFrequent;
    }
}
