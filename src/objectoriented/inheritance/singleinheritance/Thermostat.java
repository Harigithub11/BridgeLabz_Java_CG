package objectoriented.inheritance.singleinheritance;

import java.util.Scanner;

public class Thermostat extends Device {
    private double temperatureSetting;
    private String mode;

    public Thermostat() {
        super();
        this.temperatureSetting = 20.0;
        this.mode = "Auto";
    }

    public Thermostat(String deviceId, boolean status, double temperatureSetting, String mode) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
        this.mode = mode;
    }

    public double getTemperatureSetting() {
        return temperatureSetting;
    }

    public void setTemperatureSetting(double temperatureSetting) {
        this.temperatureSetting = temperatureSetting;
        System.out.println("Temperature set to " + temperatureSetting + "°C");
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
        System.out.println("Mode set to " + mode);
    }

    @Override
    public void displayStatus() {
        System.out.println("--- Thermostat Status ---");
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
        System.out.println("Mode: " + mode);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Smart Home Thermostat System ---\n");

        System.out.print("Enter Device ID: ");
        String deviceId = scanner.nextLine();
        System.out.print("Enter Initial Temperature (°C): ");
        double temp = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Mode (Heat/Cool/Auto): ");
        String mode = scanner.nextLine();

        Thermostat thermostat = new Thermostat(deviceId, false, temp, mode);

        int choice;
        do {
            System.out.println("\n--- Thermostat Menu ---");
            System.out.println("1. Turn On");
            System.out.println("2. Turn Off");
            System.out.println("3. Set Temperature");
            System.out.println("4. Set Mode");
            System.out.println("5. Display Status");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    thermostat.turnOn();
                    break;
                case 2:
                    thermostat.turnOff();
                    break;
                case 3:
                    System.out.print("Enter temperature (°C): ");
                    double newTemp = scanner.nextDouble();
                    thermostat.setTemperatureSetting(newTemp);
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.print("Enter mode (Heat/Cool/Auto): ");
                    String newMode = scanner.nextLine();
                    thermostat.setMode(newMode);
                    break;
                case 5:
                    System.out.println();
                    thermostat.displayStatus();
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
