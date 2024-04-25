package jdbc.ex.library;

import jdbc.dao.DatabaseUtil;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static bookDao bookdao;

    public static void main(String[] args) {
        bookdao = new bookDaoImpl(DatabaseUtil.getConnection());

        while(true) {
            System.out.print("""
                    ### 도서 관리 시스템 ###
                    1. 도서 추가
                    2. 도서 삭제
                    3. 도서 수정
                    4. 도서 조회
                    5. 종료
                        메뉴 선택:
                    """);
            String menu = sc.nextLine();

            switch (menu) {
                case "1" -> insert();
                case "2" -> delete();
                case "3" -> update();
                case "4" -> select();
                case "5" -> {DatabaseUtil.close(); return; }
            }
        }
    }

    private static void insert() {
        // [도서 추가]
        //ISBN 입력: 978-3-16-148410-0
        //제목 입력: 코스모스
        //저자 입력: 칼 세이건
        //출판년도 입력: 1980
        //장르 입력: 과학
        //도서가 추가되었습니다.
        System.out.println("[도서 추가]");
        System.out.print("ISBN 입력: ");
        String isbn = sc.nextLine();
        System.out.print("제목 입력: ");
        String title = sc.nextLine();
        System.out.print("저자 입력: ");
        String author = sc.nextLine();
        System.out.print("출판년도 입력: ");
        Integer year = sc.nextInt();
        sc.nextLine();
        System.out.print("장르 입력: ");
        String genre = sc.nextLine();

        bookDto bookdto = new bookDto(isbn, title, author, year, genre);
        bookdao.insert(bookdto);
        System.out.println("도서가 추가되었습니다.");
    }
    private static void delete() {
        // [도서 삭제]
        //삭제할 도서의 ISBN 입력: 978-3-16-148410-0
        //도서가 삭제되었습니다.
        System.out.println("[도서 삭제]");
        System.out.print("삭제할 도서의 ISBN 입력: ");
        String id = sc.nextLine();
        if (bookdao.getBookByIsbn(id) != null ) {
            bookdao.delete(id);
            System.out.println("도서가 삭제되었습니다.");
        } else {
            System.out.println("존재하는 도서가 없습니다.");
        }
    }
    private static void update() {
        // [도서 수정]
        //수정할 도서의 ISBN 입력: 978-3-16-148410-0
        //새 제목 입력: 코스모스 업데이트
        //새 저자 입력: 칼 세이건
        //새 출판년도 입력: 1981
        //새 장르 입력: 과학
        //도서 정보가 업데이트되었습니다.
        System.out.println("[도서 수정]");
        System.out.print("수정할 도서의 ISBN 입력: ");
        String isbn = sc.nextLine();
        bookDto book = bookdao.getBookByIsbn(isbn);

        if (book != null) {
            System.out.print("새 제목 입력: ");
            String title = sc.nextLine();
            if (!title.isEmpty()) book.setTitle(title);
            System.out.print("새 저자 입력: ");
            String author = sc.nextLine();
            if (!author.isEmpty()) book.setTitle(author);
            System.out.print("새 출판년도 입력: ");
            Integer year = sc.nextInt();
            sc.nextLine();
            if (year != null) book.setPublish_year(year);
            System.out.print("새 장르 입력: ");
            String genre = sc.nextLine();
            if (!genre.isEmpty()) book.setTitle(genre);

            bookdao.update(book);
            System.out.println("도서 정보가 업데이트되었습니다.");
        } else {
            System.out.println("존재하지 않는 도서입니다.");
        }
    }
    private static void select() {

    }
}
