package class1.ex;

public class Book {
    String title;
    String author;
    String isbn;
    boolean isAvailable;

    Book(String title, String author, String isbn, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }
    Book(String title, String author) {
        this(title, author, "-", false);
    }
}
