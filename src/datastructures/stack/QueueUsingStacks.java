package datastructures.stack;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingStacks {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueUsingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int element) {
        stack1.push(element);
        System.out.println("Enqueued: " + element);
    }

    public int dequeue() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                System.out.println("Queue is empty. Cannot dequeue.");
                return -1;
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        int element = stack2.pop();
        System.out.println("Dequeued: " + element);
        return element;
    }

    public int peek() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public int size() {
        return stack1.size() + stack2.size();
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue (front to rear): ");
        Stack<Integer> tempStack = new Stack<>();

        while (!stack2.isEmpty()) {
            int val = stack2.pop();
            System.out.print(val + " ");
            tempStack.push(val);
        }

        while (!tempStack.isEmpty()) {
            stack2.push(tempStack.pop());
        }

        Stack<Integer> reverseStack = new Stack<>();
        while (!stack1.isEmpty()) {
            reverseStack.push(stack1.pop());
        }

        while (!reverseStack.isEmpty()) {
            int val = reverseStack.pop();
            System.out.print(val + " ");
            stack1.push(val);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QueueUsingStacks queue = new QueueUsingStacks();

        int choice;
        do {
            System.out.println("\n--- Queue Using Two Stacks ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display Queue");
            System.out.println("5. Check if Empty");
            System.out.println("6. Size");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to enqueue: ");
                    int element = scanner.nextInt();
                    queue.enqueue(element);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    int frontElement = queue.peek();
                    if (frontElement != -1) {
                        System.out.println("Front element: " + frontElement);
                    }
                    break;
                case 4:
                    queue.display();
                    break;
                case 5:
                    System.out.println("Is empty: " + queue.isEmpty());
                    break;
                case 6:
                    System.out.println("Queue size: " + queue.size());
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 7);

        scanner.close();
    }
}
