package jdbc.board;

import java.util.Scanner;

// 메인 메뉴 선택 기능 추가
public class BoardEx2 {
    Scanner scanner = new Scanner(System.in);

    public void list() {
        System.out.println("[게시물 목록]");
        System.out.println("----------------------------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
        System.out.println("----------------------------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "1", "winter", "2024-04-23", "안녕하세요");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "2", "winter", "2024-04-23", "반갑습니다");
        mainMenu();
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
        System.out.println("BoardEx2.create");
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
        System.exit(0);     // 종료
    }

    public static void main(String[] args) {
        BoardEx2 boardEx = new BoardEx2();
        boardEx.list();
    }
}