import java.util.*;

class Bubblesort {
    // Generic bubble sort method
    public static <T extends Comparable<T>> T[] bsort(T[] arr, int limit) {
        T temp;
        for (int i = 0; i < limit - 1; i++) {
            for (int j = 0; j < limit - i - 1; j++) {
                // Compare elements using compareTo
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap the elements
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}

public class Bsort {
    public static void main(String[] args) {
        int n, i;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of elements:");
        n = sc.nextInt();
        
        // Define an array of Strings
        String[] s = new String[n];
        
        System.out.println("\nEnter elements:");
        for (i = 0; i < n; i++) {
            s[i] = sc.next();  // Read input for each element
        }
        
        // Call the bubbleSort method (ensure correct case and method signature)
        s = Bubblesort.bsort(s, n);

        System.out.println("\nElements after sorting:");
        // Print the sorted array
        for (i = 0; i < n; i++) {
            System.out.println(s[i]);
        }

        // Close scanner
        sc.close();
    }
}

