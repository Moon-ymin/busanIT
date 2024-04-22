package jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbc9 {
    // 데이터 수정 Update
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "1234";

        // 문자열, StringBuilder를 활용한 쿼리문 작성
        // 연결되는 쿼리문의 경우 마지막 공백(whitespace)가 없을 경우 문법 에러
        String sql = new StringBuilder()
                .append("UPDATE boards SET ")
                .append("title = ?, ")
                .append("content = ?, ")
                .append("filename = ?, ")
                .append("filedate = ? ")
                .append("WHERE boardNo = ?")
                .toString();

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)
        ) {
            pstmt.setString(1, "눈사람"); // 제목
            pstmt.setString(2, "예쁘게 만든 눈사람이에요."); // 내용
            pstmt.setString(3, "snowman.jpg"); // 파일이름
            pstmt.setBlob(4, new FileInputStream("src/jdbc/snowman.jpg")); // 파일데이터
            pstmt.setInt(5, 1);     // 게시물번호 1번 수정

            // 실행 및 행 개수 반환
            int rows = pstmt.executeUpdate();
            if (rows == 1) {
                System.out.println(rows + "개 행이 수정되었습니다.");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
