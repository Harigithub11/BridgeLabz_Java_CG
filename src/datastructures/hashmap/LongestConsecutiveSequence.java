package datastructures.hashmap;

import java.util.*;

public class LongestConsecutiveSequence {

    public static int findLongestConsecutive(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        Set<Integer> numSet = new HashSet<>();
        for (int num : arr) {
            numSet.add(num);
        }

        int maxLength = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }

    public static List<Integer> findLongestConsecutiveSequence(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new ArrayList<>();
        }

        Set<Integer> numSet = new HashSet<>();
        for (int num : arr) {
            numSet.add(num);
        }

        int maxLength = 0;
        int startNum = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    startNum = num;
                }
            }
        }

        List<Integer> sequence = new ArrayList<>();
        for (int i = 0; i < maxLength; i++) {
            sequence.add(startNum + i);
        }

        return sequence;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n--- Longest Consecutive Sequence ---");
            System.out.println("1. Find Longest Consecutive Length");
            System.out.println("2. Find Longest Consecutive Sequence");
            System.out.println("3. Example: [100, 4, 200, 1, 3, 2]");
            System.out.println("4. Example: [0, 3, 7, 2, 5, 8, 4, 6, 0, 1]");
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
                    int length = findLongestConsecutive(arr);
                    System.out.println("\nArray: " + Arrays.toString(arr));
                    System.out.println("Longest consecutive sequence length: " + length);
                    break;
                case 2:
                    System.out.print("Enter array size: ");
                    int n2 = scanner.nextInt();
                    int[] arr2 = new int[n2];
                    System.out.println("Enter array elements:");
                    for (int i = 0; i < n2; i++) {
                        arr2[i] = scanner.nextInt();
                    }
                    List<Integer> sequence = findLongestConsecutiveSequence(arr2);
                    System.out.println("\nArray: " + Arrays.toString(arr2));
                    System.out.println("Longest consecutive sequence: " + sequence);
                    System.out.println("Length: " + sequence.size());
                    break;
                case 3:
                    int[] example1 = {100, 4, 200, 1, 3, 2};
                    System.out.println("\nArray: [100, 4, 200, 1, 3, 2]");
                    List<Integer> seq1 = findLongestConsecutiveSequence(example1);
                    System.out.println("Longest consecutive sequence: " + seq1);
                    System.out.println("Length: " + seq1.size());
                    break;
                case 4:
                    int[] example2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
                    System.out.println("\nArray: [0, 3, 7, 2, 5, 8, 4, 6, 0, 1]");
                    List<Integer> seq2 = findLongestConsecutiveSequence(example2);
                    System.out.println("Longest consecutive sequence: " + seq2);
                    System.out.println("Length: " + seq2.size());
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
