package class1.ex;

public class Book {
    String title;
    String author;
    String isbn;
    boolean isAvailable;

    public Book(String title, String author, String isbn, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }
    public Book(String title, String author) {

        this(title, author, "-", false);
    }

    // 메서드
    void borrowBook() {
        // 대여를 진행
        if (isAvailable == true) {
            isAvailable = false; // 빌렸음
            System.out.println("도서를 대여하였습니다");
        } else {    // 이미 대여중인 경우
            System.out.println("도서를 대여할 수 없습니다. 대여중입니다.");
        }
    }
    void returnBook() {
        isAvailable = true;
        System.out.println("도서를 반납하였습니다.");
    }
    void printInfo(){
        System.out.printf("제목 : %s, 저자 : %s, 국제표준도서번호 : %s, " +
                        "대여 가능 여부 : %b\n",
                title, author, isbn, isAvailable);
    }
}
