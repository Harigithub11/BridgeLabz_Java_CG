package objectoriented.inheritance.introduction;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer() {
        super();
        this.programmingLanguage = "Unknown";
    }

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        System.out.println("--- Developer Details ---");
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }

    public void writeCode() {
        System.out.println(name + " is writing code in " + programmingLanguage + ".");
    }
}
