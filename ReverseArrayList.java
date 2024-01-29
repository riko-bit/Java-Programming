import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArrayList {
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
    
        Collections.reverse(arrayList);
        
        System.out.println("Reversed ArrayList: " + arrayList);
        
        scanner.close();
    }
}
