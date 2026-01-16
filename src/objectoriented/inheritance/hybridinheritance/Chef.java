package objectoriented.inheritance.hybridinheritance;

public class Chef extends Person implements Worker {
    private String specialty;
    private int yearsOfExperience;

    public Chef() {
        super();
        this.specialty = "Unknown";
        this.yearsOfExperience = 0;
    }

    public Chef(String name, int id, String specialty, int yearsOfExperience) {
        super(name, id);
        this.specialty = specialty;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is preparing " + specialty + " dishes in the kitchen.");
        System.out.println("Creating menu items and managing kitchen operations.");
    }

    @Override
    public void displayDetails() {
        System.out.println("--- Chef Details ---");
        super.displayDetails();
        System.out.println("Specialty: " + specialty);
        System.out.println("Experience: " + yearsOfExperience + " years");
    }
}
