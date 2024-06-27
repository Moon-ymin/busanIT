package io_stream.file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class File2 {
    public static void main(String[] args) throws IOException {
        /* File 클래스를 이용한 메타 정보 조회 dir 명령 clone */

        File dir = new File("C:\\TempDir\\images");
        File file1 = new File("C:\\TempDir\\file1.txt");
        File file2 = new File("C:\\TempDir\\file2.txt");
        File file3 = new File("C:\\TempDir\\file3.txt");

        // 존재하지 않을 경우 디렉토리 또는 파일 생성
        if (!dir.exists()) dir.mkdir();
        if (!file1.exists()) file1.createNewFile();
        if (!file2.exists()) file2.createNewFile();
        if (!file3.exists()) file3.createNewFile();

        // Temp 디렉토리 내부의 정보를 출력 (dir 명령)
        File tempDir = new File("C:\\TempDir");
        File[] files = tempDir.listFiles();

        // 최종 수정시간 포맷
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd a HH:MM");
        for (File file : files) {
            String lastModifiedDate = simpleDateFormat.format(new Date(file.lastModified()));
            System.out.printf("%-25s", lastModifiedDate);
            if (file.isDirectory()) {
                // 디렉토리와 이름
                System.out.printf("%-10s%-20s", "<DIR>", file.getName());
            } else {
                // 파일 크기와 이름
                System.out.printf("%-10s%-20s", file.length(), file.getName());
            }

            System.out.println();
        }

    }
}
