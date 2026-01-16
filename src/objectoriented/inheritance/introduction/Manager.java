package objectoriented.inheritance.introduction;

public class Manager extends Employee {
    private int teamSize;

    public Manager() {
        super();
        this.teamSize = 0;
    }

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        System.out.println("--- Manager Details ---");
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }

    public void conductMeeting() {
        System.out.println(name + " is conducting a team meeting with " + teamSize + " members.");
    }
}
