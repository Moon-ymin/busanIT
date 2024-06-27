package jdbc;

import java.sql.*;
import java.util.Date;

public class Jdbc4 {
    // try - with - resource 구문으로 자원 정리하기
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/scott";
        String user = "root";
        String password = "1234";

        try (Connection conn = DriverManager.getConnection(url, user, password);    // 1. 연결
             Statement stmt = conn.createStatement();                               // 2. 쿼리 생성
             ResultSet rs = stmt.executeQuery("SELECT * FROM emp")) {           // 3. 실행

            // 4. 결과 처리
            while (rs.next()) {
                int eno = rs.getInt(1); // 첫번째 컬럼을 정수타입으로 반환
                String ename = rs.getString(2);    // 두번째 컬럼을 문자열 타입으로
                Date hiredate = rs.getDate("hireDate");
                System.out.println("사원번호 : " + eno + ", 이름 : " + ename + ", 입사일 : " + hiredate);
            }
            
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } // 5. 자원 종료
        // try 구문이 끝나면 객체를 안전하게 종료함. close 메서드 사용하지 않아도
    }
}
