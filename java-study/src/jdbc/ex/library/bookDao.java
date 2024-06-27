package jdbc.ex.library;

import java.util.List;

public interface bookDao {
    // 기능 요구사항
    void insert(bookDto book);  // 도서 추가
    bookDto getBookByIsbn(String isbn); // 도서 조회
    void update(bookDto book);  // 도서 수정
    void delete(String isbn);   // 도서 삭제
    List<bookDto> getAllbooks();
    List<bookDto> getBookByAuthor(String author);
    List<bookDto> getBookByTitle(String title);

}
