package io_stream;

import java.io.*;

public class IOStream9 {
    // 기본 데이터타입 보조스트림
    public static void main(String[] args) throws IOException {
        // 파일 출력 스트림 + 보조 스트림 생성

        String sourcePath = "src/io_stream/data.db";
        FileOutputStream fos = new FileOutputStream(sourcePath);
        DataOutputStream dos = new DataOutputStream(fos);

        // 기본 타입을 쓰기
        dos.writeInt(100);
        dos.writeDouble(80.5);
        dos.writeUTF("홍길동");
        dos.writeBoolean(true);

        dos.flush();    // 버퍼 비우기
        dos.close();

        FileInputStream fis = new FileInputStream(sourcePath);
        DataInputStream dis = new DataInputStream(fis);

        // 기본 타입을 읽기
        int i = dis.readInt();
        double d = dis.readDouble();
        String s = dis.readUTF();
        boolean b = dis.readBoolean();

        System.out.println("i = " + i);
        System.out.println("d = " + d);
        System.out.println("s = " + s);
        System.out.println("b = " + b);

        dis.close();
    }
}
