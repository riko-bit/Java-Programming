import java.util.ArrayList;
import java.util.Scanner;

public class CompareArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the first ArrayList: ");
        int n1 = scanner.nextInt();

        for (int i = 0; i < n1; i++) {
            System.out.print("Enter element " + (i + 1) + " for the first ArrayList: ");
            int element = scanner.nextInt();
            arrayList1.add(element);
        }
        
        System.out.print("Enter the number of elements in the second ArrayList: ");
        int n2 = scanner.nextInt();

        for (int i = 0; i < n2; i++) {
            System.out.print("Enter element " + (i + 1) + " for the second ArrayList: ");
            int element = scanner.nextInt();
            arrayList2.add(element);
        }

        boolean areEqual = arrayList1.equals(arrayList2);

        if (areEqual) {
            System.out.println("The two ArrayLists are equal.");
        } else {
            System.out.println("The two ArrayLists are not equal.");
        }

        scanner.close();
    }
}
