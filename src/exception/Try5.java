package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Try5 {
    public static void main(String[] args) {
        // 외부 리소스, 파일과 관련된 코드 수행시
        // checked Exception으로 컴파일러 단계에서 확인
        // FileNotFoundException 을 예외처리 해주어야 한다
        try {
            FileReader fr = new FileReader("file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        }
    }
}
