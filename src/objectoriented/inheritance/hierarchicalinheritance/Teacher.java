package objectoriented.inheritance.hierarchicalinheritance;

public class Teacher extends Person {
    private String subject;
    private int yearsOfExperience;

    public Teacher() {
        super();
        this.subject = "Unknown";
        this.yearsOfExperience = 0;
    }

    public Teacher(String name, int age, String subject, int yearsOfExperience) {
        super(name, age);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Teacher");
    }

    @Override
    public void displayDetails() {
        displayRole();
        super.displayDetails();
        System.out.println("Subject: " + subject);
        System.out.println("Experience: " + yearsOfExperience + " years");
    }

    public void teach() {
        System.out.println(name + " is teaching " + subject + ".");
    }
}
