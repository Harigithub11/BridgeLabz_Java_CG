package objectoriented.inheritance.hybridinheritance;

public class ElectricVehicle extends Vehicle {
    private int batteryCapacity;
    private int currentCharge;

    public ElectricVehicle() {
        super();
        this.batteryCapacity = 0;
        this.currentCharge = 0;
    }

    public ElectricVehicle(int maxSpeed, String model, int batteryCapacity, int currentCharge) {
        super(maxSpeed, model);
        this.batteryCapacity = batteryCapacity;
        this.currentCharge = currentCharge;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getCurrentCharge() {
        return currentCharge;
    }

    public void setCurrentCharge(int currentCharge) {
        this.currentCharge = currentCharge;
    }

    public void charge() {
        currentCharge = batteryCapacity;
        System.out.println(model + " is charging...");
        System.out.println("Battery fully charged to " + batteryCapacity + " kWh.");
    }

    @Override
    public void displayInfo() {
        System.out.println("--- Electric Vehicle ---");
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("Current Charge: " + currentCharge + " kWh");
    }
}
