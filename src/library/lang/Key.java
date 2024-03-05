package library.lang;

import java.util.HashMap;

public class Key {
    int number;

    public Key(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return number == key.number;
    }

    @Override
    public int hashCode() {
        // 마법사에서 자동으로 필드 기준 해시 함수 적용
//        return Objects.hash(number);
        // 편의상 필드값으로 변경
        return number;
    }

    public static void main(String[] args) {
        // Key 타입을 식별키로 사용하여 문자열 값을 저장하는 HashMap 자료구조
        HashMap<Key, String> hashMap = new HashMap<>();

        // 식별키 새로 생성하여 값을 저장
        hashMap.put(new Key(1), "홍길동");

        // 새로운 식별키(number는 같음) 값을 가져옴
        String value = hashMap.get(new Key(1));
        System.out.println(value);
    }
}
