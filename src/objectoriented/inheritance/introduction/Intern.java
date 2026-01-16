package objectoriented.inheritance.introduction;

public class Intern extends Employee {
    private String university;
    private int durationMonths;

    public Intern() {
        super();
        this.university = "Unknown";
        this.durationMonths = 0;
    }

    public Intern(String name, int id, double salary, String university, int durationMonths) {
        super(name, id, salary);
        this.university = university;
        this.durationMonths = durationMonths;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getDurationMonths() {
        return durationMonths;
    }

    public void setDurationMonths(int durationMonths) {
        this.durationMonths = durationMonths;
    }

    @Override
    public void displayDetails() {
        System.out.println("--- Intern Details ---");
        super.displayDetails();
        System.out.println("University: " + university);
        System.out.println("Internship Duration: " + durationMonths + " months");
    }

    public void learnSkills() {
        System.out.println(name + " is learning new skills during the internship.");
    }
}
