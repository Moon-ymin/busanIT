package io_stream.serial;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial1 {
    public static void main(String[] args) {
        String filePath = "src/io_stream/serial/person.ser";

        Person person = new Person("홍길동", 30, 180,
                false, 70, new Career("조선 컴퍼니", 10));

        try (
                FileOutputStream fos = new FileOutputStream(filePath);
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                ObjectOutputStream oos = new ObjectOutputStream(bos);
        ) {
            oos.writeObject(person);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
