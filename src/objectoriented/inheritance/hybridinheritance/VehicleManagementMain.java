package objectoriented.inheritance.hybridinheritance;

import java.util.Scanner;

public class VehicleManagementMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Vehicle Management System with Hybrid Inheritance ---\n");

        System.out.println("Enter Electric Vehicle details:");
        System.out.print("Model: ");
        String evModel = scanner.nextLine();
        System.out.print("Max Speed (km/h): ");
        int evSpeed = scanner.nextInt();
        System.out.print("Battery Capacity (kWh): ");
        int batteryCapacity = scanner.nextInt();
        System.out.print("Current Charge (kWh): ");
        int currentCharge = scanner.nextInt();
        scanner.nextLine();

        ElectricVehicle ev = new ElectricVehicle(evSpeed, evModel, batteryCapacity, currentCharge);

        System.out.println("\nEnter Petrol Vehicle details:");
        System.out.print("Model: ");
        String pvModel = scanner.nextLine();
        System.out.print("Max Speed (km/h): ");
        int pvSpeed = scanner.nextInt();
        System.out.print("Fuel Capacity (liters): ");
        double fuelCapacity = scanner.nextDouble();
        System.out.print("Current Fuel (liters): ");
        double currentFuel = scanner.nextDouble();

        PetrolVehicle pv = new PetrolVehicle(pvSpeed, pvModel, fuelCapacity, currentFuel);

        System.out.println("\n--- Vehicle Details ---");
        ev.displayInfo();
        System.out.println();
        pv.displayInfo();

        System.out.println("\n--- Vehicle Operations ---");
        System.out.println("\nCharging Electric Vehicle:");
        ev.charge();

        System.out.println("\nRefueling Petrol Vehicle (via Refuelable interface):");
        pv.refuel();

        System.out.println("\n--- Polymorphism Demo ---");
        Vehicle[] vehicles = {ev, pv};
        System.out.println("Displaying all vehicles:");
        for (Vehicle v : vehicles) {
            System.out.println();
            v.displayInfo();
        }

        System.out.println("\n--- Interface Demo ---");
        System.out.println("Only Petrol Vehicle implements Refuelable:");
        Refuelable[] refuelables = {pv};
        for (Refuelable r : refuelables) {
            r.refuel();
        }

        scanner.close();
    }
}
