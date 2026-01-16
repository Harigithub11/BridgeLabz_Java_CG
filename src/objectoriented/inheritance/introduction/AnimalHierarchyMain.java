package objectoriented.inheritance.introduction;

import java.util.Scanner;

public class AnimalHierarchyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Animal[] animals = new Animal[3];

        System.out.println("--- Animal Hierarchy Demo ---\n");

        System.out.println("Enter Dog details:");
        System.out.print("Name: ");
        String dogName = scanner.nextLine();
        System.out.print("Age: ");
        int dogAge = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Breed: ");
        String breed = scanner.nextLine();
        animals[0] = new Dog(dogName, dogAge, breed);

        System.out.println("\nEnter Cat details:");
        System.out.print("Name: ");
        String catName = scanner.nextLine();
        System.out.print("Age: ");
        int catAge = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Color: ");
        String color = scanner.nextLine();
        animals[1] = new Cat(catName, catAge, color);

        System.out.println("\nEnter Bird details:");
        System.out.print("Name: ");
        String birdName = scanner.nextLine();
        System.out.print("Age: ");
        int birdAge = scanner.nextInt();
        System.out.print("Wingspan (cm): ");
        double wingspan = scanner.nextDouble();
        animals[2] = new Bird(birdName, birdAge, wingspan);

        System.out.println("\n--- Polymorphism Demo: Calling makeSound() on Animal array ---");
        for (Animal animal : animals) {
            System.out.println();
            animal.displayInfo();
            animal.makeSound();
        }

        System.out.println("\n--- Unique Behaviors ---");
        ((Dog) animals[0]).fetch();
        ((Cat) animals[1]).scratch();
        ((Bird) animals[2]).fly();

        scanner.close();
    }
}
