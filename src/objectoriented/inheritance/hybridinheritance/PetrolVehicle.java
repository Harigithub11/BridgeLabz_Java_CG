package objectoriented.inheritance.hybridinheritance;

public class PetrolVehicle extends Vehicle implements Refuelable {
    private double fuelCapacity;
    private double currentFuel;

    public PetrolVehicle() {
        super();
        this.fuelCapacity = 0.0;
        this.currentFuel = 0.0;
    }

    public PetrolVehicle(int maxSpeed, String model, double fuelCapacity, double currentFuel) {
        super(maxSpeed, model);
        this.fuelCapacity = fuelCapacity;
        this.currentFuel = currentFuel;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getCurrentFuel() {
        return currentFuel;
    }

    public void setCurrentFuel(double currentFuel) {
        this.currentFuel = currentFuel;
    }

    @Override
    public void refuel() {
        currentFuel = fuelCapacity;
        System.out.println(model + " is refueling...");
        System.out.println("Tank filled to " + fuelCapacity + " liters.");
    }

    @Override
    public void displayInfo() {
        System.out.println("--- Petrol Vehicle ---");
        super.displayInfo();
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
        System.out.println("Current Fuel: " + currentFuel + " liters");
    }
}
