package quiz.quiz7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class q5 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("디렉토리 경로를 입력하세요: ");
        Path dirPath = Paths.get(sc.nextLine());

        long total = 0;

        total = Files.walk(dirPath)
                .filter(path -> path.toFile().isFile())
                .mapToLong(path -> path.toFile().length()).sum();

        System.out.println("총 크기는 "+total+"Byte 입니다." );
    }
}
