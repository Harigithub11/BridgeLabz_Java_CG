package objectoriented.inheritance.hybridinheritance;

public class Waiter extends Person implements Worker {
    private int tablesAssigned;
    private String shift;

    public Waiter() {
        super();
        this.tablesAssigned = 0;
        this.shift = "Unknown";
    }

    public Waiter(String name, int id, int tablesAssigned, String shift) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
        this.shift = shift;
    }

    public int getTablesAssigned() {
        return tablesAssigned;
    }

    public void setTablesAssigned(int tablesAssigned) {
        this.tablesAssigned = tablesAssigned;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving " + tablesAssigned + " tables during " + shift + " shift.");
        System.out.println("Taking orders, serving food, and ensuring customer satisfaction.");
    }

    @Override
    public void displayDetails() {
        System.out.println("--- Waiter Details ---");
        super.displayDetails();
        System.out.println("Tables Assigned: " + tablesAssigned);
        System.out.println("Shift: " + shift);
    }
}
