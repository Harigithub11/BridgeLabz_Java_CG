package datastructures.stack;

import java.util.Scanner;
import java.util.Stack;

public class StockSpanProblem {

    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            stack.push(i);
        }

        return span;
    }

    public static void displayPricesAndSpan(int[] prices, int[] span) {
        System.out.println("\nDay\tPrice\tSpan");
        System.out.println("---\t-----\t----");
        for (int i = 0; i < prices.length; i++) {
            System.out.println((i + 1) + "\t" + prices[i] + "\t" + span[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n--- Stock Span Problem ---");
            System.out.println("1. Calculate Stock Span");
            System.out.println("2. Example: [100, 80, 60, 70, 60, 75, 85]");
            System.out.println("3. Example: [10, 4, 5, 90, 120, 80]");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number of days: ");
                    int n = scanner.nextInt();
                    int[] prices = new int[n];
                    System.out.println("Enter stock prices for each day:");
                    for (int i = 0; i < n; i++) {
                        System.out.print("Day " + (i + 1) + ": ");
                        prices[i] = scanner.nextInt();
                    }
                    int[] span = calculateSpan(prices);
                    displayPricesAndSpan(prices, span);
                    break;
                case 2:
                    int[] example1 = {100, 80, 60, 70, 60, 75, 85};
                    System.out.println("\nExample: [100, 80, 60, 70, 60, 75, 85]");
                    int[] span1 = calculateSpan(example1);
                    displayPricesAndSpan(example1, span1);
                    break;
                case 3:
                    int[] example2 = {10, 4, 5, 90, 120, 80};
                    System.out.println("\nExample: [10, 4, 5, 90, 120, 80]");
                    int[] span2 = calculateSpan(example2);
                    displayPricesAndSpan(example2, span2);
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
