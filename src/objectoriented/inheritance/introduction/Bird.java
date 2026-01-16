package objectoriented.inheritance.introduction;

public class Bird extends Animal {
    private double wingspan;

    public Bird() {
        super();
        this.wingspan = 0.0;
    }

    public Bird(String name, int age, double wingspan) {
        super(name, age);
        this.wingspan = wingspan;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Tweet! Tweet!");
    }

    public void fly() {
        System.out.println(name + " is flying with wingspan of " + wingspan + " cm.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Wingspan: " + wingspan + " cm");
    }
}
