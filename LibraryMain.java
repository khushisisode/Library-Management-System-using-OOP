import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        int choice;
        do {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter book author: ");
                    String author = sc.nextLine();
                    Book book = new Book(title, author);
                    library.addBook(book);
                }
                case 2 -> library.displayBooks();
                case 3 -> {
                    System.out.print("Enter title to issue: ");
                    String title = sc.nextLine();
                    library.issueBook(title);
                }
                case 4 -> {
                    System.out.print("Enter title to return: ");
                    String title = sc.nextLine();
                    library.returnBook(title);
                }
                case 5 -> System.out.println("Exiting Library System.");
                default -> System.out.println("Invalid option. Try again.");
            }
        } while (choice != 5);
    }
}
