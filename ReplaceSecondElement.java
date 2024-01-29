import java.util.ArrayList;
import java.util.Scanner;

public class ReplaceSecondElement {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int element = scanner.nextInt();
            arrayList.add(element);
        }

        System.out.println("Original ArrayList: " + arrayList);

        if (arrayList.size() >= 2) {
            System.out.print("Enter the element to replace the second element with: ");
            int replacementElement = scanner.nextInt();

            arrayList.set(1, replacementElement);
            
            System.out.println("Updated ArrayList: " + arrayList);
        } else {
            System.out.println("The ArrayList does not have at least 2 elements. Cannot replace the second element.");
        }

        scanner.close();
    }
}
