package class1.ex;

public class Ex4 {
    /*
    1. Board 클래스의 생성자가 다음과 같이 오버로딩 되어 있습니다.
      생성자마다 중복 코딩 된 부분이 있습니다.
      this()를 활용해서 중복 코드를 제거해보세요 .
    2. main 메서드에서 Board 객체를 생성하는 네 가지 방법을 모두 사용해보세요.
     */
    public static void main(String[] args) {
        Board board1 = new Board("java study","coding");
        Board board2 = new Board("python study", "coding","이순신");
        Board board3 = new Board("machine learning","study","홍길동","20240219");
        Board board4 = new Board("AI","study","이몽룡","2023",3);

        Board[] boards = {board1, board2, board3, board4};
        for (Board b : boards) {
            System.out.printf("title : %s | content : %s | writer : %s | date : %s | hits : %d\n",
                    b.title, b.content, b.writer, b.date, b.hitCount );
        }
    }
}

class Board {
    String title;
    String content;
    String writer;
    String date;
    int hitCount;

    Board(String title, String content) {
        this(title, content, "로그인한 회원아이디", "현재 컴퓨터 날짜", 0);
    }

    Board(String title, String content, String writer) {
        this(title, content, writer,"현재 컴퓨터 날짜",0 );
    }

    Board(String title, String content, String writer, String date) {
        this(title, content, writer, date, 0);
    }

    public Board(String title, String content, String writer, String date, int hitCount) {
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
        this.hitCount = hitCount;
    }
}