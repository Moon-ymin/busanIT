package access_modifier.ex;

import access_modifier.ex.com.library.management.Book;
import access_modifier.ex.com.library.management.Library;

public class Ex3 {
    public static void main(String[] args) {
        Library library1 = new Library(2);

        Book book1 = new Book("노인과 바다", "어니스트 헤밍웨이");
        Book book2 = new Book("클린 코드", "로버트 C. 마틴");

        library1.addBook( book1 );
        library1.addBook( book2 );


        library1.listBooks();
    }
}
