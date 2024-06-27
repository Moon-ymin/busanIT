package inheritance.ex.Ex1;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954);
        book.displayInfo();
        System.out.println();
        Reference reference = new Reference("Math Handbook", "John Doe", 1999, "Mathematics");
        reference.displayInfo();


    }
}
