package datastructures.hashmap;

import java.util.*;

public class ZeroSumSubarray {

    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, List<Integer>> sumMap = new HashMap<>();
        int cumSum = 0;

        sumMap.put(0, new ArrayList<>());
        sumMap.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            cumSum += arr[i];

            if (sumMap.containsKey(cumSum)) {
                List<Integer> indices = sumMap.get(cumSum);
                for (int startIndex : indices) {
                    result.add(new int[]{startIndex + 1, i});
                }
            }

            sumMap.putIfAbsent(cumSum, new ArrayList<>());
            sumMap.get(cumSum).add(i);
        }

        return result;
    }

    public static void displaySubarrays(int[] arr, List<int[]> subarrays) {
        if (subarrays.isEmpty()) {
            System.out.println("No zero-sum subarrays found.");
            return;
        }

        System.out.println("\nZero-sum subarrays found: " + subarrays.size());
        for (int i = 0; i < subarrays.size(); i++) {
            int[] range = subarrays.get(i);
            System.out.print((i + 1) + ". [" + range[0] + " to " + range[1] + "]: ");
            int sum = 0;
            for (int j = range[0]; j <= range[1]; j++) {
                System.out.print(arr[j] + " ");
                sum += arr[j];
            }
            System.out.println("(sum = " + sum + ")");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n--- Find All Subarrays with Zero Sum ---");
            System.out.println("1. Find Zero-Sum Subarrays");
            System.out.println("2. Example: [4, 2, -3, 1, 6]");
            System.out.println("3. Example: [4, 2, 0, 1, 6]");
            System.out.println("4. Example: [3, 4, -7, 3, 1, 3, 1, -4, -2, -2]");
            System.out.println("5. Exit");
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
                    List<int[]> result = findZeroSumSubarrays(arr);
                    displaySubarrays(arr, result);
                    break;
                case 2:
                    int[] example1 = {4, 2, -3, 1, 6};
                    System.out.println("\nArray: [4, 2, -3, 1, 6]");
                    List<int[]> result1 = findZeroSumSubarrays(example1);
                    displaySubarrays(example1, result1);
                    break;
                case 3:
                    int[] example2 = {4, 2, 0, 1, 6};
                    System.out.println("\nArray: [4, 2, 0, 1, 6]");
                    List<int[]> result2 = findZeroSumSubarrays(example2);
                    displaySubarrays(example2, result2);
                    break;
                case 4:
                    int[] example3 = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
                    System.out.println("\nArray: [3, 4, -7, 3, 1, 3, 1, -4, -2, -2]");
                    List<int[]> result3 = findZeroSumSubarrays(example3);
                    displaySubarrays(example3, result3);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
