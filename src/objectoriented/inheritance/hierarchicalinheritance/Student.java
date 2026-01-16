package objectoriented.inheritance.hierarchicalinheritance;

public class Student extends Person {
    private String grade;
    private int rollNumber;

    public Student() {
        super();
        this.grade = "Unknown";
        this.rollNumber = 0;
    }

    public Student(String name, int age, String grade, int rollNumber) {
        super(name, age);
        this.grade = grade;
        this.rollNumber = rollNumber;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Student");
    }

    @Override
    public void displayDetails() {
        displayRole();
        super.displayDetails();
        System.out.println("Grade: " + grade);
        System.out.println("Roll Number: " + rollNumber);
    }

    public void study() {
        System.out.println(name + " is studying in grade " + grade + ".");
    }
}
