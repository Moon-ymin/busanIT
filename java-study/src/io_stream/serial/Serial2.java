package io_stream.serial;

import java.io.*;

public class Serial2 {
    public static void main(String[] args) throws IOException {
        String filePath = "src/io_stream/serial/person.ser";

        try ( ObjectInputStream ois = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(filePath)))) {
            Person person = (Person) ois.readObject();
            System.out.println(person);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
