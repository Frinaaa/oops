import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class DequeOperations {
    public static void main(String[] args) {
        // Create a deque using LinkedList
        Deque<String> deque = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // Allow user to manually insert elements into the deque
        System.out.println("Enter the number of elements you want to add to the deque:");
        int numElements = scanner.nextInt();  // Number of elements to add
        scanner.nextLine();  // Consume the newline left by nextInt()

        for (int i = 0; i < numElements; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            String element = scanner.nextLine();
            deque.add(element);  // Adding element to the tail (end) of the deque
        }

        System.out.println("Deque after manual additions: " + deque);

        // Perform deletions using remove(), poll(), and pollLast()

        // remove() - removes and returns the head element (throws exception if empty)
        String removedElement = deque.remove();
        System.out.println("Element removed using remove(): " + removedElement);
        System.out.println("Deque after remove(): " + deque);

        // poll() - removes and returns the head element (returns null if empty)
        String polledElement = deque.poll();
        System.out.println("Element removed using poll(): " + polledElement);
        System.out.println("Deque after poll(): " + deque);

        // pollLast() - removes and returns the tail element (returns null if empty)
        String polledLastElement = deque.pollLast();
        System.out.println("Element removed using pollLast(): " + polledLastElement);
        System.out.println("Deque after pollLast(): " + deque);

        // Close scanner
        scanner.close();
    }
}

