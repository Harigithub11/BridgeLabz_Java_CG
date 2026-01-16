package objectoriented.inheritance.introduction;

import java.util.Scanner;

public class EmployeeManagementMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee[] employees = new Employee[3];

        System.out.println("--- Employee Management System ---\n");

        System.out.println("Enter Manager details:");
        System.out.print("Name: ");
        String mgrName = scanner.nextLine();
        System.out.print("ID: ");
        int mgrId = scanner.nextInt();
        System.out.print("Salary: ");
        double mgrSalary = scanner.nextDouble();
        System.out.print("Team Size: ");
        int teamSize = scanner.nextInt();
        scanner.nextLine();
        employees[0] = new Manager(mgrName, mgrId, mgrSalary, teamSize);

        System.out.println("\nEnter Developer details:");
        System.out.print("Name: ");
        String devName = scanner.nextLine();
        System.out.print("ID: ");
        int devId = scanner.nextInt();
        System.out.print("Salary: ");
        double devSalary = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Programming Language: ");
        String language = scanner.nextLine();
        employees[1] = new Developer(devName, devId, devSalary, language);

        System.out.println("\nEnter Intern details:");
        System.out.print("Name: ");
        String intName = scanner.nextLine();
        System.out.print("ID: ");
        int intId = scanner.nextInt();
        System.out.print("Salary: ");
        double intSalary = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("University: ");
        String university = scanner.nextLine();
        System.out.print("Duration (months): ");
        int duration = scanner.nextInt();
        employees[2] = new Intern(intName, intId, intSalary, university, duration);

        System.out.println("\n--- All Employee Details ---");
        for (Employee emp : employees) {
            System.out.println();
            emp.displayDetails();
        }

        System.out.println("\n--- Unique Behaviors ---");
        ((Manager) employees[0]).conductMeeting();
        ((Developer) employees[1]).writeCode();
        ((Intern) employees[2]).learnSkills();

        scanner.close();
    }
}
