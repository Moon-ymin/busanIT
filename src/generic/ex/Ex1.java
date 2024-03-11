package generic.ex;

public class Ex1 {
    // 1. 클래스 정의
    static class Pair<K,V> {
        K key;
        V value;

        // 2. 생성자 정의
        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
    public static void main(String[] args) {
        // Integer와 String 타입을 가진 Pair 객체 생성
        Pair<Integer, String> pair1 = new Pair<>(1, "Apple");
        System.out.println("Pair 1: " + pair1.getKey() + " - " + pair1.getValue());

        // String과 Boolean 타입을 가진 Pair 객체 생성
        Pair<String, Boolean> pair2 = new Pair<>("KeyExists", true);
        System.out.println("Pair 2: " + pair2.getKey() + " - " + pair2.getValue());

        Pair<Integer, String> pair3 = new Pair<>(1, "홍길동");
        System.out.println("pair3.getKey() = " + pair3.getKey());
        System.out.println("pair3.getValue() = " + pair3.getValue());
    }
}
