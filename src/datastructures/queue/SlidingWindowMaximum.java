package datastructures.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class SlidingWindowMaximum {

    public static int[] findSlidingWindowMaximum(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k <= 0) {
            return new int[0];
        }

        int n = arr.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                deque.pollLast();
            }

            deque.offerLast(i);

            if (i >= k - 1) {
                result[i - k + 1] = arr[deque.peekFirst()];
            }
        }

        return result;
    }

    public static void displayResult(int[] arr, int k, int[] result) {
        System.out.println("\nArray: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n\nWindow Size: " + k);
        System.out.println("\nSliding Window Maximums:");
        for (int i = 0; i < result.length; i++) {
            System.out.print("Window [" + i + " to " + (i + k - 1) + "]: ");
            for (int j = i; j < i + k; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println("-> Max: " + result[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n--- Sliding Window Maximum ---");
            System.out.println("1. Find Sliding Window Maximum");
            System.out.println("2. Example: [1, 3, -1, -3, 5, 3, 6, 7], k=3");
            System.out.println("3. Example: [9, 10, 9, -7, -4, -8, 2, -6], k=5");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter array size: ");
                    int n = scanner.nextInt();
                    int[] arr = new int[n];
                    System.out.println("Enter array elements:");
                    for (int i = 0; i < n; i++) {
                        arr[i] = scanner.nextInt();
                    }
                    System.out.print("Enter window size k: ");
                    int k = scanner.nextInt();
                    if (k > n || k <= 0) {
                        System.out.println("Invalid window size.");
                    } else {
                        int[] result = findSlidingWindowMaximum(arr, k);
                        displayResult(arr, k, result);
                    }
                    break;
                case 2:
                    int[] example1 = {1, 3, -1, -3, 5, 3, 6, 7};
                    int k1 = 3;
                    System.out.println("\nExample: [1, 3, -1, -3, 5, 3, 6, 7], k=3");
                    int[] result1 = findSlidingWindowMaximum(example1, k1);
                    displayResult(example1, k1, result1);
                    break;
                case 3:
                    int[] example2 = {9, 10, 9, -7, -4, -8, 2, -6};
                    int k2 = 5;
                    System.out.println("\nExample: [9, 10, 9, -7, -4, -8, 2, -6], k=5");
                    int[] result2 = findSlidingWindowMaximum(example2, k2);
                    displayResult(example2, k2, result2);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
