package class1.ex;

public class Ex3 {
    /*
    Book 클래스를 설계해주세요.

    필드:
    title (제목): String 타입
    author (저자): String 타입
    isbn (국제표준도서번호): String 타입
    isAvailable (대여 가능 여부): boolean 타입

    생성자:
    모든 필드를 매개변수로 받아 초기화하는 생성자를 작성하세요.
    title, author만 매개변수로 받아 초기화하는 생성자를 작성하세요.

    메서드:
    borrowBook(): 이 메서드는 도서의 대여 가능 여부(isAvailable)를 확인하고, 도서를 대여할 수 있다면 isAvailable을 false로 변경하고 true를 반환합니다. 이미 대여 중이라면 false를 반환합니다.
    returnBook(): 도서를 반납하고 isAvailable을 true로 변경합니다.
    printInfo(): 현재 도서의 상태정보를 출력하는 메서드를 만들어보세요.

    - 메인메서드에서 책을 2권 생성하고, 각 메서드를 실행해보세요.
     */
    public static void main(String[] args) {
        Book book = new Book("혼자 공부하는 자바","가나다","01",true);
        Book book1 = new Book("점프 투 자바","위키북스","01",true);
        Book book2 = new Book("자바 알고리즘","위키북스");

        borrowBook(book2);
        returnBook(book2);

        Book[] books = { book, book1, book2 };
        for ( Book b : books ) {
            printInfo(b);
        }

    }
    static boolean borrowBook(Book book) {
        if (book.isAvailable == true) {
            book.isAvailable = false;
            return true;
        } else {
            System.out.println("대여가 불가능합니다");
            return false;
        }
    }
    static void returnBook(Book book) {
        book.isAvailable = true;
    }
    static void printInfo(Book book){
        System.out.printf("제목 : %s, 저자 : %s, 국제표준도서번호 : %s, 대여 가능 여부 : %b\n",
                book.title, book.author, book.isbn, book.isAvailable);
    }
}