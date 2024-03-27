package io_stream.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class File1 {
    // java.io 패키지 파일과 디렉토리 정보를 가지고 있는
    // File 클래스 Files 클래스를 제공
    public static void main(String[] args) throws IOException {
        // new File("경로");
        // 절대경로
        File directory = new File("C:\\TempDir");
        File file1 = new File("C:\\TempDir\\file1.txt");

        // 디렉토리 생성
        directory.mkdir();
        // 파일 생성
        file1.createNewFile();

        // 디렉토리 내부의 파일 배열 반환
        File[] files = directory.listFiles();

        // 파일 정보 확인
        for(File file : files) {
            System.out.println("파일명 : " + file.getName());
            System.out.println("절대경로 : " + file.getAbsolutePath());
            System.out.println("읽기 가능 여부 : " + file.canRead());
            System.out.println("쓰기 가능 여부 : " + file.canWrite());
            System.out.println("파일 크기 : " + file.length() + "byte");
            System.out.println("최종 수정 시간 : " + new Date( file.lastModified()) );
            System.out.println("파일 여부 : " + file.isFile());
            System.out.println("디렉토리 여부 : " + file.isDirectory());
            System.out.println("존재 여부 : " + file.exists());
            
        }

    }
}
