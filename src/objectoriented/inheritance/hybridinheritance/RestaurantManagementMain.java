package objectoriented.inheritance.hybridinheritance;

import java.util.Scanner;

public class RestaurantManagementMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Restaurant Management System ---\n");

        System.out.println("Enter Chef details:");
        System.out.print("Name: ");
        String chefName = scanner.nextLine();
        System.out.print("ID: ");
        int chefId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Specialty Cuisine: ");
        String specialty = scanner.nextLine();
        System.out.print("Years of Experience: ");
        int experience = scanner.nextInt();
        scanner.nextLine();

        Chef chef = new Chef(chefName, chefId, specialty, experience);

        System.out.println("\nEnter Waiter details:");
        System.out.print("Name: ");
        String waiterName = scanner.nextLine();
        System.out.print("ID: ");
        int waiterId = scanner.nextInt();
        System.out.print("Tables Assigned: ");
        int tables = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Shift (Morning/Evening/Night): ");
        String shift = scanner.nextLine();

        Waiter waiter = new Waiter(waiterName, waiterId, tables, shift);

        System.out.println("\n--- Staff Details ---");
        chef.displayDetails();
        System.out.println();
        waiter.displayDetails();

        System.out.println("\n--- Staff Duties (Polymorphism via Worker Interface) ---");
        Worker[] workers = {chef, waiter};
        for (Worker worker : workers) {
            System.out.println();
            worker.performDuties();
        }

        scanner.close();
    }
}
