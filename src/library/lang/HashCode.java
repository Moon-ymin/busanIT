package library.lang;

import java.util.Objects;

public class HashCode {
    public static void main(String[] args) {
        // Object 클래스의 hashcode
        // 기본적으로 메모리 주소를 기반으로 한 정수값을 가짐.
        // equals() 메서드를 오버라이드 해서 동등성을 비교하는 경우,
        // hashCode() 메서드도 함께 오버라이드하여, 동등한 객체가 나오도록 반환해야함.
        // => 일관성이 중요함.

        // HashSet, HashMap, HashTable 등 hash값을 이용하는 자료구조에서
        // 동등성을 비교할 때
        // 먼저 hashCode() 값을 비교함 => 다르면 다른 객체, 같으면
        // 다음으로 equals() 값을 비교함 => false면 다른 객체
        // true면 동등 객체
        // hashCode는 hash 충돌이 발생할 수 있다 : 서로 다른 입력 값에 대해서
        // 동일한 해시값이 생성되는 경우, 잘 만든 해시함수는 hash 충돌을 최소화하지만
        // 완전히 hash충돌이 없을 수는 없다.
        // equals와 hashCode는 반드시 일관성을 가져야 한다
        // 같은 key -> 같은 value 무결성을 검증할 수 있음


        Object object = new Object();
        System.out.println(object.hashCode());
        System.out.println(object);

        Member member1 = new Member("홍길동", 30);
        Member member2 = new Member("유관순", 18);

        int hash1 = member1.hashCode();
        int hash2 = member2.hashCode();

        System.out.println("hash1 = " + hash1);
        System.out.println("hash2 = " + hash2);
    }

    static class Member {
        private String name;
        private int age;

        public Member(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int hashCode() {
            // 임의의 해시 정수를 생성 (이렇게 만들 필요 없음)
            return 100 + age * 31 + name.hashCode();
        }

        // equals 메서드와 일관성을 가져야 함
        // 두 메서드 모두 age와 name을 기준으로 오버라이딩
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Member member = (Member) o;
            return age == member.age && Objects.equals(name, member.name);
        }
    }
}