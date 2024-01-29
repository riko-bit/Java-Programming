import java.util.ArrayList;
import java.util.Scanner;

public class PrintArrayListElementsByPosition {
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

        while (true) {
            System.out.print("Enter the position (0-based) to print an element (or -1 to exit): ");
            int position = scanner.nextInt();
            
            if (position == -1) {
                break;
            }

            if (position >= 0 && position < arrayList.size()) {
                int element = arrayList.get(position);
                System.out.println("Element at position " + position + ": " + element);
            } else {
                System.out.println("Invalid position. Please enter a valid position between 0 and " + (arrayList.size() - 1));
            }
        }

        scanner.close();
    }
}
