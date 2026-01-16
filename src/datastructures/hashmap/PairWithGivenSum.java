package datastructures.hashmap;

import java.util.*;

public class PairWithGivenSum {

    public static List<int[]> findPairsWithSum(int[] arr, int target) {
        List<int[]> pairs = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                for (int j : map.get(complement)) {
                    pairs.add(new int[]{arr[j], arr[i], j, i});
                }
            }

            map.putIfAbsent(arr[i], new ArrayList<>());
            map.get(arr[i]).add(i);
        }

        return pairs;
    }

    public static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(target - num)) {
                return true;
            }
            seen.add(num);
        }

        return false;
    }

    public static void displayPairs(int[] arr, int target, List<int[]> pairs) {
        System.out.println("\nArray: " + Arrays.toString(arr));
        System.out.println("Target Sum: " + target);

        if (pairs.isEmpty()) {
            System.out.println("No pairs found with sum " + target);
            return;
        }

        System.out.println("\nPairs found: " + pairs.size());
        for (int i = 0; i < pairs.size(); i++) {
            int[] pair = pairs.get(i);
            System.out.println((i + 1) + ". " + pair[0] + " + " + pair[1] +
                             " = " + target + " (indices: " + pair[2] + ", " + pair[3] + ")");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n--- Pair with Given Sum ---");
            System.out.println("1. Find All Pairs");
            System.out.println("2. Check if Pair Exists");
            System.out.println("3. Example: [1, 5, 7, -1, 5], target=6");
            System.out.println("4. Example: [2, 3, 4, -2, 6, 8, 9], target=6");
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
                    System.out.print("Enter target sum: ");
                    int target = scanner.nextInt();
                    List<int[]> pairs = findPairsWithSum(arr, target);
                    displayPairs(arr, target, pairs);
                    break;
                case 2:
                    System.out.print("Enter array size: ");
                    int n2 = scanner.nextInt();
                    int[] arr2 = new int[n2];
                    System.out.println("Enter array elements:");
                    for (int i = 0; i < n2; i++) {
                        arr2[i] = scanner.nextInt();
                    }
                    System.out.print("Enter target sum: ");
                    int target2 = scanner.nextInt();
                    boolean exists = hasPairWithSum(arr2, target2);
                    System.out.println("\nArray: " + Arrays.toString(arr2));
                    System.out.println("Target: " + target2);
                    System.out.println("Pair exists: " + exists);
                    break;
                case 3:
                    int[] example1 = {1, 5, 7, -1, 5};
                    int target1 = 6;
                    System.out.println("\nExample: [1, 5, 7, -1, 5], target=6");
                    List<int[]> pairs1 = findPairsWithSum(example1, target1);
                    displayPairs(example1, target1, pairs1);
                    break;
                case 4:
                    int[] example2 = {2, 3, 4, -2, 6, 8, 9};
                    int target2Ex = 6;
                    System.out.println("\nExample: [2, 3, 4, -2, 6, 8, 9], target=6");
                    List<int[]> pairs2 = findPairsWithSum(example2, target2Ex);
                    displayPairs(example2, target2Ex, pairs2);
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
