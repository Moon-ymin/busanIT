package variable;

public class Type2 {
    public static void main(String[] args) {

        // 메모리 공간 예약
        // 정수
        byte b = 127; // -128 ~ 127 (2^8만큼의 데이터를 저장) 1byte
        short s = 32767; // -32,768~ 32,767 (2^16) 2byte
        int i = 214748647; // -214748648 ~ 214748647 (2^3) 4byte
        long l = 9223372036854775807L; // (2^64) 8byte

        // 실수
        float f = 10.0f; // 데이터 정밀도 7자리 (4byte = 32bit)
        double d = 10.0; // 정밀도 15자리 (8byte = 64bit)

    }
}
