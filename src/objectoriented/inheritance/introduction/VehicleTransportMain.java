package objectoriented.inheritance.introduction;

import java.util.Scanner;

public class VehicleTransportMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vehicle[] vehicles = new Vehicle[3];

        System.out.println("--- Vehicle and Transport System ---\n");

        System.out.println("Enter Car details:");
        System.out.print("Max Speed (km/h): ");
        int carSpeed = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Fuel Type: ");
        String carFuel = scanner.nextLine();
        System.out.print("Brand: ");
        String brand = scanner.nextLine();
        System.out.print("Seat Capacity: ");
        int seats = scanner.nextInt();
        vehicles[0] = new Car(carSpeed, carFuel, seats, brand);

        System.out.println("\nEnter Truck details:");
        System.out.print("Max Speed (km/h): ");
        int truckSpeed = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Fuel Type: ");
        String truckFuel = scanner.nextLine();
        System.out.print("Load Capacity (tons): ");
        double loadCapacity = scanner.nextDouble();
        System.out.print("Number of Wheels: ");
        int wheels = scanner.nextInt();
        vehicles[1] = new Truck(truckSpeed, truckFuel, loadCapacity, wheels);

        System.out.println("\nEnter Motorcycle details:");
        System.out.print("Max Speed (km/h): ");
        int bikeSpeed = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Fuel Type: ");
        String bikeFuel = scanner.nextLine();
        System.out.print("Engine CC: ");
        int engineCC = scanner.nextInt();
        System.out.print("Has Sidecar (true/false): ");
        boolean hasSidecar = scanner.nextBoolean();
        vehicles[2] = new Motorcycle(bikeSpeed, bikeFuel, hasSidecar, engineCC);

        System.out.println("\n--- Polymorphism Demo: Calling displayInfo() on Vehicle array ---");
        for (Vehicle vehicle : vehicles) {
            System.out.println();
            vehicle.displayInfo();
        }

        scanner.close();
    }
}
