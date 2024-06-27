package BookManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class bookDaoImpl implements bookDao {
    Connection conn;

    public bookDaoImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(bookDto book) {
        String sql = """
                INSERT INTO books (isbn, title, author, publish_year, genre)
                VALUES (?, ?, ?, ?, ?)
                """;
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, book.getIsbn());
            pstmt.setString(2, book.getTitle());
            pstmt.setString(3, book.getAuthor());
            pstmt.setInt(4, book.getPublish_year());
            pstmt.setString(5, book.getGenre());
            pstmt.executeUpdate();

            pstmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public bookDto getBookByIsbn(String isbn) {
        // - ISBN으로 특정 도서 조회
        // - 저자나 제목으로 도서 검색
        String sql = """
                SELECT * FROM books
                WHERE isbn = ?
                """;
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, isbn);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return new bookDto(
                        rs.getString("isbn"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getInt("publish_year"),
                        rs.getString("genre")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public List<bookDto> getBookByAuthor(String author) {
        List<bookDto> books = new ArrayList<>();
        String sql = """
                SELECT * FROM books
                WHERE author = ?
                """;
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, author);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                bookDto book = new bookDto(
                        rs.getString("isbn"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getInt("publish_year"),
                        rs.getString("genre")
                );
                books.add(book);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return books;
    }

    @Override
    public List<bookDto> getBookByTitle(String title) {
        List<bookDto> books = new ArrayList<>();
        String sql = """
                SELECT * FROM books
                WHERE title = ?
                """;
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, title);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                bookDto book =  new bookDto(
                        rs.getString("isbn"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getInt("publish_year"),
                        rs.getString("genre")
                );
                books.add(book);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return books;
    }

    @Override
    public void update(bookDto book) {
        // 도서의 정보를 수정할 수 있어야 합니다.
        // 주로 제목, 저자, 출판년도, 장르를 수정할 수 있어야 합니다.
        String sql = """
                UPDATE books SET
                title = ?, author = ?, publish_year =?, genre = ?
                WHERE isbn = ?
                """;
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, book.getTitle());
            pstmt.setString(2, book.getAuthor());
            pstmt.setInt(3, book.getPublish_year());
            pstmt.setString(4, book.getGenre());
            pstmt.setString(5, book.getIsbn());
            pstmt.executeUpdate();
            pstmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(String isbn) {
        // 특정 ISBN을 기준으로 도서를 삭제할 수 있어야 합니다.
        String sql = "DELETE FROM books WHERE isbn = ?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, isbn);
            pstmt.executeUpdate();
            pstmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<bookDto> getAllbooks() {
        // 전체 도서 목록 조회
        List<bookDto> books = new ArrayList<>();
        String sql = "SELECT * FROM books";
        try {
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
                bookDto book = new bookDto(
                        rs.getString("isbn"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getInt("publish_year"),
                        rs.getString("genre")
                );
                books.add(book);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return books;
    }
}
