package objectoriented.inheritance.introduction;

public class Car extends Vehicle {
    private int seatCapacity;
    private String brand;

    public Car() {
        super();
        this.seatCapacity = 0;
        this.brand = "Unknown";
    }

    public Car(int maxSpeed, String fuelType, int seatCapacity, String brand) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
        this.brand = brand;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void displayInfo() {
        System.out.println("--- Car Details ---");
        super.displayInfo();
        System.out.println("Brand: " + brand);
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}
