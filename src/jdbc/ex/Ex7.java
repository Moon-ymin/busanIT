package jdbc.ex;

import jdbc.board.Board;
import jdbc.object.User;

import java.sql.*;
import java.util.Scanner;


public class Ex7 {
    // 필드
    private Scanner scanner = new Scanner(System.in);
    private Connection conn;
    private String id;
    private boolean isLogin = false;
    // 생성자
    public Ex7() {
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
        if (!isLogin) {
            System.out.println("[게시물 목록]");
        } else {
            System.out.println("[게시물 목록] 사용자 : " + id);
        }

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
        if (!isLogin) {
            System.out.println("----------------------------------------------------------------");
            System.out.println("메인메뉴 : 1. Create | 2. Read | 3. Clear | 4. Join | 5.Login | 6.Exit");
            System.out.print("메뉴선택 : ");
            String menuNo = scanner.nextLine();

            switch (menuNo) {
                case "1" -> create();
                case "2" -> read();
                case "3" -> clear();
                case "4" -> join();
                case "5" -> login();
                case "6" -> exit();
            }
        } else {
            System.out.println("메인메뉴: 1.Create | 2.Read | 3.Clear | 4.Logout | 5.Exit");
            System.out.print("메뉴선택 : ");
            String menuNo = scanner.nextLine();

            switch (menuNo) {
                case "1" -> create();
                case "2" -> read();
                case "3" -> clear();
                case "4" -> logout();
                case "5" -> exit();
            }
        }
    }

    private void create() {
        // 게시글 입력받아 객체 생성
        System.out.println("[새 게시물 생성]");
        System.out.print("제목 : ");
        String title = scanner.nextLine();
        System.out.print("내용 : ");
        String content = scanner.nextLine();
        String writer = null;

        if (!isLogin) {
            System.out.print("글쓴이 : ");
            writer = scanner.nextLine();
        } else {
            writer = findName();
        }
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
                    VALUES (?, ?, ?)
                    """;

            // 객체에서 필드를 가져와 동적 SQL 완성
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
        System.out.println("[게시물 읽기]");
        System.out.print("게시글번호 : ");
        int boardNo = Integer.parseInt(scanner.nextLine());

        String sql = """
                SELECT boardNo, title, content, writer, date
                FROM boards WHERE boardNo = ?
                """;

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // SQL문 실행
            pstmt.setInt(1, boardNo);
            ResultSet rs = pstmt.executeQuery();

            // 결과 처리
            if (rs.next()) {
                // 게시글 객체 생성
                Board board = new Board(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDate(5)
                );

                // 게시글 상세내용 출력
                System.out.println("-----------------------------------");
                System.out.println("글번호 : " + board.getBoardNo());
                System.out.println("글제목 : " + board.getTitle());
                System.out.println("글내용 : " + board.getContent());
                System.out.println("글쓴이 : " + board.getWriter());
                System.out.println("쓴날짜 : " + board.getDate());
                System.out.println("-----------------------------------");

                String writer = board.getWriter();

                // 보조메뉴 출력
                if (isLogin) {
                    // 로그인한 상태에서
                    // 작성자랑 로그인 한 사람이랑 같으면 보조 메뉴 출력
                    if (writer.equals(findName())) {
                        System.out.println("보조메뉴 : 1. Update | 2. Delete | 3. List");
                        System.out.print("메뉴선택 : ");
                        String menu = scanner.nextLine();

                        // 상세 게시글에서 수정, 삭제 기능 (게시글 객체 전달)
                        if (menu.equals("1")) {
                            update(board);
                        } else if (menu.equals("2")) {
                            delete(board);
                        }
                    }
                } // 로그인 안했으면 그냥 바로 목록 출력하러 감
            }

            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
            exit();
        }

        // 게시글 목록
        list();
    }

    private void update(Board board) {
        // 수정 내용 입력받기
        System.out.println("[수정할 내용 입력]");
        System.out.print("제목 : ");
        String title = scanner.nextLine();
        if (!title.isEmpty()) board.setTitle(title);

        System.out.print("내용 : ");
        String content = scanner.nextLine();
        if (!content.isEmpty()) board.setContent(content);
        String writer = null;
        if (!isLogin) {
            System.out.print("글쓴이 : ");
            writer = scanner.nextLine();
        }
        if (!writer.isEmpty()) board.setWriter(writer);

        // 보조 메뉴 출력
        System.out.println("------------------------");
        System.out.println("보조메뉴: 1.Ok | 2.Cancel");
        System.out.print("메뉴선택 : ");
        String menu = scanner.nextLine();

        // 게시글 수정
        if (menu.equals("1")) {
            String sql = """
                    UPDATE boards
                    SET title = ?, content= ?, writer= ?
                    WHERE boardNo = ?
                    """;
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

                pstmt.setString(1, board.getTitle());
                pstmt.setString(2, board.getContent());
                pstmt.setString(3, board.getWriter());
                pstmt.setInt(4, board.getBoardNo());
                pstmt.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
                exit();
            }
        }

    }

    private void delete(Board board) {
        System.out.print("정말 삭제하시겠습니까? (y/n)");
        String response = scanner.nextLine();
        if (response.equals("y")) {
            String sql = "DELETE FROM boards WHERE boardNo = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setInt(1, board.getBoardNo());
                pstmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
                exit();
            }
        }
    }

    private void clear() {
        // 보조 메뉴 출력
        System.out.println("------------------------");
        System.out.println("모든 게시글을 삭제합니다. 정말 삭제하시겠습니까?");
        System.out.println("보조메뉴: 1.Ok | 2.Cancel");
        System.out.print("메뉴선택 : ");
        String menu = scanner.nextLine();

        if (menu.equals("1")) {
            String sql = "TRUNCATE TABLE boards";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                int rows = pstmt.executeUpdate();
                System.out.println("모두 " + rows + "개의 게시글이 삭제되었습니다.");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }


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
        Ex5 boardEx = new Ex5();
        boardEx.list();
    }


    private void join() {
        System.out.println("[새 사용자 입력]");
        System.out.print("아이디 : ");
        String newId = scanner.nextLine();
        System.out.print("이름 : ");
        String newname = scanner.nextLine();
        System.out.print("비밀번호 : ");
        String newpassword = scanner.nextLine();
        System.out.print("나이 : ");
        Integer newage = scanner.nextInt();
        scanner.next();
        System.out.print("이메일 : ");
        String newemail = scanner.nextLine();

        User user = new User(newId, newname, newpassword, newage, newemail);

        // 보조 메뉴
        System.out.println("------------------------------------------");
        System.out.println("보조메뉴: 1.OK | 2. Cancel");
        System.out.print("메뉴선택 : ");
        String menu = scanner.nextLine();

        // 보조메뉴 1 선택한 경우
        if (menu.equals("1")) {
            String sql = """
                    INSERT INTO users (userId, userName, password, age, email)
                    VALUES (?, ?, ?, ?, ?);
                    """;

            try ( PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, user.getUserId());
                pstmt.setString(2, user.getUserName());
                pstmt.setString(3, user.getPassword());
                pstmt.setInt(4, user.getAge());
                pstmt.setString(5, user.getEmail());
                pstmt.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
                exit();
            }
        }
        list();
    }
    private void login() {
        System.out.println("[로그인]");
        System.out.print("아이디 : ");
        id = scanner.nextLine();
        System.out.print("비밀번호 : ");
        String pw = scanner.nextLine();

        System.out.println("-----------------------------------------");
        System.out.println("보조메뉴 : 1. OK | 2. Cancel");
        String menu = scanner.nextLine();

        // 보조메뉴 1 선택하면
        if ( menu.equals("1") ) {
            // 비밀번호 대조
            String loginsql = """
                    SELECT password
                    FROM USER
                    WHERE userId = ?
                    """;

            try( PreparedStatement pstmt = conn.prepareStatement(loginsql)) {
                // SQL 문 실행
                pstmt.setString(1, id);
                ResultSet rs = pstmt.executeQuery();

                // 게시물 목록 출력
                isLogin = true;
                list();

            } catch (SQLException e){
                System.out.println("비밀번호가 일치하지 않습니다.");
                login();
            }
        }
        list();
    }
    private void logout() {
        isLogin = false;
        list();
    }

    // User 스키마에서 아이디로 -> 이름 찾기
    private String findName() {
        // 아이디로 사용자 이름 받아오기
        String namesql = """
                    SELECT userName FROM USER WHERE userId = ?
                    """;

        try ( PreparedStatement pstmt = conn.prepareStatement(namesql)) {
            // SQL 문 실행
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();

            // 결과 처리
            User user = new User(rs.getString(1));
            return user.getUserName();
        } catch (SQLException e) {
            e.printStackTrace();
            exit();
        }
        return "해당 사용자를 찾을 수 없습니다.";
    }
}