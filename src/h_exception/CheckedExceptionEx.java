package h_exception;

import java.io.*;

// 자바는 메서드의 CheckedException을 처리해야 함.
public class CheckedExceptionEx {
    public void readFile() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("README.md"));

            String line = bufferedReader.readLine();
            System.out.println(line);

            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}