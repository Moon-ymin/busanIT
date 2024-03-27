package io_stream.file.ex;


import java.io.*;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("병합할 파일의 개수를 입력하세요: ");
        int cnt = sc.nextInt();

        String[] filePaths = new String[cnt];
        for (int i = 0; i < cnt; i++) {
            System.out.print("파일 경로를 입력하세요: ");
            filePaths[i] = sc.next();
        }

        String mergedPath = "src/io_stream/file/ex/merged.txt";
        FileWriter fw = new FileWriter(mergedPath);
        for (String filepath : filePaths) {
            File file = new File(filepath);
            if (!file.exists()) {
                System.out.println(filepath + "에 파일이 존재하지 않습니다.");
                return;
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ( (line = br.readLine()) != null ){
                fw.write(line);
                fw.write("\n");
            }
            fw.write("-----\n");
        }
        fw.close();
        System.out.println("파일 병합 완료");
    }
}
