package datastructures.queue;

import java.util.Scanner;

public class CircularTourProblem {

    static class PetrolPump {
        int petrol;
        int distance;

        PetrolPump(int petrol, int distance) {
            this.petrol = petrol;
            this.distance = distance;
        }
    }

    public static int findStartingPoint(PetrolPump[] pumps) {
        int n = pumps.length;
        int start = 0;
        int currentPetrol = 0;
        int totalPetrol = 0;
        int totalDistance = 0;

        for (int i = 0; i < n; i++) {
            totalPetrol += pumps[i].petrol;
            totalDistance += pumps[i].distance;
            currentPetrol += pumps[i].petrol - pumps[i].distance;

            if (currentPetrol < 0) {
                start = i + 1;
                currentPetrol = 0;
            }
        }

        if (totalPetrol < totalDistance) {
            return -1;
        }

        return start;
    }

    public static void displayTour(PetrolPump[] pumps, int start) {
        if (start == -1) {
            System.out.println("No solution exists. Total petrol is less than total distance.");
            return;
        }

        System.out.println("\nStarting point: Pump " + start);
        System.out.println("\nCircular Tour Simulation:");
        int n = pumps.length;
        int currentPetrol = 0;

        for (int i = 0; i < n; i++) {
            int index = (start + i) % n;
            System.out.println("\nPump " + index + ":");
            System.out.println("  Petrol before: " + currentPetrol);
            System.out.println("  Petrol added: " + pumps[index].petrol);
            currentPetrol += pumps[index].petrol;
            System.out.println("  Petrol after refuel: " + currentPetrol);
            System.out.println("  Distance to next: " + pumps[index].distance);
            currentPetrol -= pumps[index].distance;
            System.out.println("  Petrol after travel: " + currentPetrol);

            if (currentPetrol < 0) {
                System.out.println("  [Failed - not enough petrol]");
                return;
            }
        }

        System.out.println("\nTour completed successfully!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n--- Circular Tour Problem ---");
            System.out.println("1. Find Starting Point for Custom Input");
            System.out.println("2. Example 1: [(4,6), (6,5), (7,3), (4,5)]");
            System.out.println("3. Example 2: [(6,4), (3,6), (7,3)]");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number of petrol pumps: ");
                    int n = scanner.nextInt();
                    PetrolPump[] pumps = new PetrolPump[n];
                    System.out.println("Enter (petrol, distance) for each pump:");
                    for (int i = 0; i < n; i++) {
                        System.out.print("Pump " + i + " - Petrol: ");
                        int petrol = scanner.nextInt();
                        System.out.print("Pump " + i + " - Distance to next: ");
                        int distance = scanner.nextInt();
                        pumps[i] = new PetrolPump(petrol, distance);
                    }
                    int start = findStartingPoint(pumps);
                    displayTour(pumps, start);
                    break;
                case 2:
                    PetrolPump[] example1 = {
                        new PetrolPump(4, 6),
                        new PetrolPump(6, 5),
                        new PetrolPump(7, 3),
                        new PetrolPump(4, 5)
                    };
                    System.out.println("\nExample 1: [(4,6), (6,5), (7,3), (4,5)]");
                    int start1 = findStartingPoint(example1);
                    displayTour(example1, start1);
                    break;
                case 3:
                    PetrolPump[] example2 = {
                        new PetrolPump(6, 4),
                        new PetrolPump(3, 6),
                        new PetrolPump(7, 3)
                    };
                    System.out.println("\nExample 2: [(6,4), (3,6), (7,3)]");
                    int start2 = findStartingPoint(example2);
                    displayTour(example2, start2);
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
