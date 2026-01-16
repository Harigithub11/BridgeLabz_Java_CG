package objectoriented.inheritance.introduction;

public class Cat extends Animal {
    private String color;

    public Cat() {
        super();
        this.color = "Unknown";
    }

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow! Meow!");
    }

    public void scratch() {
        System.out.println(name + " is scratching the furniture.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Color: " + color);
    }
}
