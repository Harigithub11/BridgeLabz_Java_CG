package objectoriented.inheritance.hierarchicalinheritance;

import java.util.Scanner;

public class SchoolSystemMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- School System Demo ---\n");

        Person[] people = new Person[3];

        System.out.println("Enter Teacher details:");
        System.out.print("Name: ");
        String teacherName = scanner.nextLine();
        System.out.print("Age: ");
        int teacherAge = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Subject: ");
        String subject = scanner.nextLine();
        System.out.print("Years of Experience: ");
        int experience = scanner.nextInt();
        scanner.nextLine();
        people[0] = new Teacher(teacherName, teacherAge, subject, experience);

        System.out.println("\nEnter Student details:");
        System.out.print("Name: ");
        String studentName = scanner.nextLine();
        System.out.print("Age: ");
        int studentAge = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Grade: ");
        String grade = scanner.nextLine();
        System.out.print("Roll Number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine();
        people[1] = new Student(studentName, studentAge, grade, rollNumber);

        System.out.println("\nEnter Staff details:");
        System.out.print("Name: ");
        String staffName = scanner.nextLine();
        System.out.print("Age: ");
        int staffAge = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Department: ");
        String department = scanner.nextLine();
        System.out.print("Position: ");
        String position = scanner.nextLine();
        people[2] = new Staff(staffName, staffAge, department, position);

        System.out.println("\n--- All People in School ---");
        for (Person person : people) {
            System.out.println();
            person.displayDetails();
        }

        System.out.println("\n--- Activities ---");
        ((Teacher) people[0]).teach();
        ((Student) people[1]).study();
        ((Staff) people[2]).work();

        scanner.close();
    }
}
