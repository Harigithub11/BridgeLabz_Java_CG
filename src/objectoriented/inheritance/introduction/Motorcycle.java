package objectoriented.inheritance.introduction;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    private int engineCC;

    public Motorcycle() {
        super();
        this.hasSidecar = false;
        this.engineCC = 0;
    }

    public Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar, int engineCC) {
        super(maxSpeed, fuelType);
        this.hasSidecar = hasSidecar;
        this.engineCC = engineCC;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    public int getEngineCC() {
        return engineCC;
    }

    public void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }

    @Override
    public void displayInfo() {
        System.out.println("--- Motorcycle Details ---");
        super.displayInfo();
        System.out.println("Engine: " + engineCC + " CC");
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}
