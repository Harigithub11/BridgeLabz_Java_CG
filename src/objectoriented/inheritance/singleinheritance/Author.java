package objectoriented.inheritance.singleinheritance;

import java.util.Scanner;

public class Author extends Book {
    private String name;
    private String bio;

    public Author() {
        super();
        this.name = "Unknown";
        this.bio = "No bio available";
    }

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        System.out.println("--- Book and Author Details ---");
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Library Management System ---\n");

        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Publication Year: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Author Name: ");
        String authorName = scanner.nextLine();
        System.out.print("Enter Author Bio: ");
        String bio = scanner.nextLine();

        Author bookWithAuthor = new Author(title, year, authorName, bio);

        System.out.println();
        bookWithAuthor.displayInfo();

        scanner.close();
    }
}
