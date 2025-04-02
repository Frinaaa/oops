import java.util.Scanner;
import java.util.Arrays;

public class LinearSearch 
{
    public static int LinearSearch(int[] arr, int target) 
    {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();   
        int[] arr = new int[n];   
        System.out.println("Enter " + n + " elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
	    System.out.println("sorted array:" + Arrays.toString(arr));
        
        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();       
        int result = LinearSearch(arr, target);
        if (result != -1) 
        {
            System.out.println("Element " + target + " found at index " + result + ".");
        }
        else 
        {
            System.out.println("Element " + target + " not found in the array.");
        }
        
        scanner.close();
    }
}
