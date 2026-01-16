package objectoriented.inheritance.introduction;

public class Dog extends Animal {
    private String breed;

    public Dog() {
        super();
        this.breed = "Unknown";
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof! Woof!");
    }

    public void fetch() {
        System.out.println(name + " is fetching the ball.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }
}
