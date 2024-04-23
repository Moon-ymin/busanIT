package jdbc.board;

import java.sql.*;
import java.util.Scanner;

// Step 4 : 게시물 생성 기능 추가
public class BoardEx4 {
    // 필드
    private Scanner scanner = new Scanner(System.in);
    private Connection conn;

    // 생성자
    public BoardEx4() {
        // 인스턴스 생성되면서 객체 연결하고 예외 생기면 메시지 출력 후 종료
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String dbUser = "root";
        String dbPassword = "1234";
        try {
            conn = DriverManager.getConnection(url, dbUser, dbPassword);
        } catch (SQLException e) {
            e.printStackTrace();
            exit();
        }
    }

    public void list() {
        System.out.println("[게시물 목록]");
        System.out.println("----------------------------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
        System.out.println("----------------------------------------------------------------");

        // DB 게시판 테이블에서 역순 정렬하여 출력하기
        String sql = """
                SELECT boardNo, title, content, writer, date
                FROM boards ORDER BY boardNo DESC
                """;

        // SQL 명령문 및 결과 셋 자원 생성 및 정리
        try (PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            // 결과 셋에서 행마다 게시글 객체 생성
            while (rs.next()) {
                Board board = new Board(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDate(5)
                );

                // 행마다 출력
                System.out.printf("%-6s%-12s%-16s%-40s\n",
                        board.getBoardNo(),
                        board.getWriter(),
                        board.getDate(),
                        board.getTitle());
            }
        } catch (SQLException e) {
            e.printStackTrace();
            exit();
        }

        mainMenu(); // 메인메뉴 출력
    }

    public void mainMenu() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("메인메뉴 : 1. Create | 2. Read | 3. Clear | 4. Exit");
        System.out.print("메뉴선택 : ");
        String menuNo = scanner.nextLine();

        switch (menuNo) {
            case "1" -> create();
            case "2" -> read();
            case "3" -> clear();
            case "4" -> exit();
        }
    }

    private void create() {
        // 게시글 입력받아 객체 생성
        System.out.println("[새 게시물 생성]");
        System.out.print("제목 : ");
        String title = scanner.nextLine();
        System.out.print("내용 : ");
        String content = scanner.nextLine();
        System.out.print("글쓴이 : ");
        String writer = scanner.nextLine();

        Board board = new Board(title, content, writer);

        // 보조 메뉴 출력
        System.out.println("------------------------");
        System.out.println("보조메뉴: 1.Ok | 2.Cancel");
        System.out.print("메뉴선택 : ");
        String menu = scanner.nextLine();

        // 글쓰기 Ok 한 경우
        if (menu.equals("1")) {
            String sql = """
                    INSERT INTO boards (title, content, writer)
                    values (?, ?, ?)
                    """;
            // 객체에서 필드를 가져와 동작 SQL 완성
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, board.getTitle());
                pstmt.setString(2, board.getContent());
                pstmt.setString(3, board.getWriter());
                pstmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
                exit();
            }

        }
        // 게시글 목록 출력
        list();
    }

    private void read() {
        System.out.println("BoardEx2.read");
        list();
    }

    private void clear() {
        System.out.println("BoardEx2.clear");
        list();
    }

    private void exit() {
        try {
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            System.exit(0);     // 종료
        }
    }

    public static void main(String[] args) {
        BoardEx4 boardEx = new BoardEx4();
        boardEx.list();
    }
}