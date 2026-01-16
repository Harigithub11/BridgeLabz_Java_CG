package objectoriented.inheritance.multilevelinheritance;

import java.util.Scanner;

public class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    public PaidOnlineCourse() {
        super();
        this.fee = 0.0;
        this.discount = 0.0;
    }

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded,
                            double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getFinalPrice() {
        return fee - (fee * discount / 100);
    }

    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: $" + getFinalPrice());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Educational Course Hierarchy ---\n");

        System.out.println("Enter Course Details:");
        System.out.print("Course Name: ");
        String courseName = scanner.nextLine();
        System.out.print("Duration (hours): ");
        int duration = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nEnter Online Course Details:");
        System.out.print("Platform: ");
        String platform = scanner.nextLine();
        System.out.print("Is Recorded (true/false): ");
        boolean isRecorded = scanner.nextBoolean();

        System.out.println("\nEnter Pricing Details:");
        System.out.print("Fee: ");
        double fee = scanner.nextDouble();
        System.out.print("Discount (%): ");
        double discount = scanner.nextDouble();

        System.out.println("\n--- Course at Different Levels ---");

        System.out.println("\n1. Basic Course:");
        Course basicCourse = new Course(courseName, duration);
        basicCourse.displayCourseDetails();

        System.out.println("\n2. Online Course:");
        OnlineCourse onlineCourse = new OnlineCourse(courseName, duration, platform, isRecorded);
        onlineCourse.displayCourseDetails();

        System.out.println("\n3. Paid Online Course:");
        PaidOnlineCourse paidCourse = new PaidOnlineCourse(courseName, duration, platform, isRecorded, fee, discount);
        paidCourse.displayCourseDetails();

        scanner.close();
    }
}
