package datastructures.stack;

import java.util.Scanner;
import java.util.Stack;

public class SortStackRecursion {

    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop();
            sortStack(stack);
            insertInSortedOrder(stack, top);
        }
    }

    private static void insertInSortedOrder(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || element > stack.peek()) {
            stack.push(element);
            return;
        }
        int top = stack.pop();
        insertInSortedOrder(stack, element);
        stack.push(top);
    }

    public static void displayStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack (top to bottom): ");
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.isEmpty()) {
            int val = stack.pop();
            System.out.print(val + " ");
            tempStack.push(val);
        }
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int choice;
        do {
            System.out.println("\n--- Sort Stack Using Recursion ---");
            System.out.println("1. Push Element");
            System.out.println("2. Pop Element");
            System.out.println("3. Display Stack");
            System.out.println("4. Sort Stack");
            System.out.println("5. Clear Stack");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int element = scanner.nextInt();
                    stack.push(element);
                    System.out.println("Pushed: " + element);
                    break;
                case 2:
                    if (!stack.isEmpty()) {
                        int popped = stack.pop();
                        System.out.println("Popped: " + popped);
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                case 3:
                    displayStack(stack);
                    break;
                case 4:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty. Nothing to sort.");
                    } else {
                        System.out.println("Sorting stack...");
                        sortStack(stack);
                        System.out.println("Stack sorted in descending order (top to bottom).");
                        displayStack(stack);
                    }
                    break;
                case 5:
                    stack.clear();
                    System.out.println("Stack cleared.");
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
