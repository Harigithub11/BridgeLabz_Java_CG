package datastructures.hashmap;

import java.util.*;

public class TwoSum {

    public static int[] findTwoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(arr[i], i);
        }

        return new int[]{-1, -1};
    }

    public static List<int[]> findAllTwoSums(int[] arr, int target) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                for (int j : map.get(complement)) {
                    result.add(new int[]{j, i});
                }
            }

            map.putIfAbsent(arr[i], new ArrayList<>());
            map.get(arr[i]).add(i);
        }

        return result;
    }

    public static void displayResult(int[] arr, int target, int[] indices) {
        System.out.println("\nArray: " + Arrays.toString(arr));
        System.out.println("Target: " + target);

        if (indices[0] == -1) {
            System.out.println("No solution found.");
        } else {
            System.out.println("Indices: [" + indices[0] + ", " + indices[1] + "]");
            System.out.println("Values: [" + arr[indices[0]] + ", " + arr[indices[1]] + "]");
            System.out.println("Sum: " + arr[indices[0]] + " + " + arr[indices[1]] + " = " + target);
        }
    }

    public static void displayAllResults(int[] arr, int target, List<int[]> results) {
        System.out.println("\nArray: " + Arrays.toString(arr));
        System.out.println("Target: " + target);

        if (results.isEmpty()) {
            System.out.println("No pairs found.");
        } else {
            System.out.println("\nAll pairs found: " + results.size());
            for (int i = 0; i < results.size(); i++) {
                int[] indices = results.get(i);
                System.out.println((i + 1) + ". Indices: [" + indices[0] + ", " + indices[1] +
                                 "], Values: [" + arr[indices[0]] + ", " + arr[indices[1]] + "]");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n--- Two Sum Problem ---");
            System.out.println("1. Find First Two Sum");
            System.out.println("2. Find All Two Sums");
            System.out.println("3. Example: [2, 7, 11, 15], target=9");
            System.out.println("4. Example: [3, 2, 4], target=6");
            System.out.println("5. Example: [3, 3], target=6");
            System.out.println("6. Exit");
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
                    int[] result = findTwoSum(arr, target);
                    displayResult(arr, target, result);
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
                    List<int[]> results = findAllTwoSums(arr2, target2);
                    displayAllResults(arr2, target2, results);
                    break;
                case 3:
                    int[] example1 = {2, 7, 11, 15};
                    int target1 = 9;
                    System.out.println("\nExample: [2, 7, 11, 15], target=9");
                    int[] result1 = findTwoSum(example1, target1);
                    displayResult(example1, target1, result1);
                    break;
                case 4:
                    int[] example2 = {3, 2, 4};
                    int target2Ex = 6;
                    System.out.println("\nExample: [3, 2, 4], target=6");
                    int[] result2 = findTwoSum(example2, target2Ex);
                    displayResult(example2, target2Ex, result2);
                    break;
                case 5:
                    int[] example3 = {3, 3};
                    int target3 = 6;
                    System.out.println("\nExample: [3, 3], target=6");
                    int[] result3 = findTwoSum(example3, target3);
                    displayResult(example3, target3, result3);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
