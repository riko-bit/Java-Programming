import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}

public class BookCollection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> collection = new ArrayList<>();

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add a book");
            System.out.println("2. Remove a book");
            System.out.println("3. Display all books");
            System.out.println("4. Quit");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    Book book = new Book(title, author, isbn);
                    collection.add(book);
                    System.out.println("Book added successfully!");
                    break;
                case 2:
                    System.out.print("Enter ISBN of the book to remove: ");
                    String isbnToRemove = scanner.nextLine();
                    boolean removed = false;
                    for (int i = 0; i < collection.size(); i++) {
                        if (collection.get(i).getIsbn().equals(isbnToRemove)) {
                            collection.remove(i);
                            removed = true;
                            System.out.println("Book removed successfully!");
                            break;
                        }
                    }
                    if (!removed) {
                        System.out.println("Book not found in the collection.");
                    }
                    break;
                case 3:
                    System.out.println("Books in the collection:");
                    for (Book b : collection) {
                        System.out.println(b);
                    }
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
