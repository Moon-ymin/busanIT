package access_modifier.ex.com.library.management;

public class Library {
    Book[] books;
    int index;

    public Library(int capacity) {
        books = new Book[capacity];
    }
    public void addBook(Book book){
        books[index] = book;
        index++;
    }

    public void listBooks(){
        System.out.println("도서 목록:");
        for(int i=0; i<books.length; i++) {
            System.out.printf("%d. 제목: %s, 저자: %s\n",
                    i+1, books[i].getTitle(), books[i].getAuthor());
        }
    }
}
