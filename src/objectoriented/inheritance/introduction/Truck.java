package objectoriented.inheritance.introduction;

public class Truck extends Vehicle {
    private double loadCapacity;
    private int numberOfWheels;

    public Truck() {
        super();
        this.loadCapacity = 0.0;
        this.numberOfWheels = 0;
    }

    public Truck(int maxSpeed, String fuelType, double loadCapacity, int numberOfWheels) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
        this.numberOfWheels = numberOfWheels;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void displayInfo() {
        System.out.println("--- Truck Details ---");
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
        System.out.println("Number of Wheels: " + numberOfWheels);
    }
}
