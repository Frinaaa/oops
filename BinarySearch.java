import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch
{
	public static int binarySearch(int[] arr, int target)
	{
	int low=0;
	int high =arr.length-1;
	while(low <= high)
	{
	  int mid=(low + high)/2;
	        if(arr[mid] == target)
	        {
	        return mid;
	        }
	        if(arr[mid]< target)
	        {
	        low = mid+1;
	        }
	        else
	        {
	        high = mid-1;
	        }
	        }
	        
	        return -1;
	        }
	        
	        public static void main(String[] args)
	        {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("enter the size of the array:");
	        int n =scanner.nextInt();
	        
	        int[] arr = new int[n];
	        
	        System.out.println("enter " + n + " elements of the array:");
	        for(int i=0;i<n;i++)
	        {
	        arr[i] = scanner.nextInt();
	        }
			
	        Arrays.sort(arr);
	        System.out.println("sorted array:" + Arrays.toString(arr));
			
	        System.out.print("enter the element to search for:");
	        int target = scanner.nextInt();
	        
	        
	        int result = binarySearch(arr,target);
	        
	        if(result!=-1)
	        {
	        System.out.println("element " + target + " found at index " + result + ".");
	        }
	        else
	        {
	        System.out.println("element " + target + " not found in the array ");
	        }
	        
	        scanner.close();
	        }}

	  
