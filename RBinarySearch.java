import java.util.Scanner;
import java.util.Arrays;

public class RBinarySearch
 {

    public static int recursiveBinarySearch(int[] arr, int low, int high, int target)
        { 
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;

        if (arr[mid] == target)
        {
            return mid;
        }

        if (arr[mid] > target) 
        {
            return recursiveBinarySearch(arr, low, mid - 1, target);
        }
        return recursiveBinarySearch(arr, mid + 1, high, target);
        }

    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements of the array :");
        for (int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
	       System.out.println("sorted array:" + Arrays.toString(arr));
      
        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        
        int result = recursiveBinarySearch(arr, 0, n - 1, target);

       
        if (result != -1)
        {
            System.out.println("Element " + target + " found at index " + result + ".");
        } else 
        {
            System.out.println("Element " + target + " not found in the array.");
        }

        scanner.close();
    }
}

