package objectoriented.inheritance.hierarchicalinheritance;

public class Staff extends Person {
    private String department;
    private String position;

    public Staff() {
        super();
        this.department = "Unknown";
        this.position = "Unknown";
    }

    public Staff(String name, int age, String department, String position) {
        super(name, age);
        this.department = department;
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Staff");
    }

    @Override
    public void displayDetails() {
        displayRole();
        super.displayDetails();
        System.out.println("Department: " + department);
        System.out.println("Position: " + position);
    }

    public void work() {
        System.out.println(name + " is working in " + department + " as " + position + ".");
    }
}
