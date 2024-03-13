package collection.set;

import java.util.TreeSet;

public class Compare {
    // Compare 인터페이스
    // java.lang 패키지
    // Comparable 을 구현하는 클래스의 객체들은 자연스러운 순서로 정렬될 수 있음
    // 단 하나의 추상 메서드
    // compareTo (다른 객체)
    // 반환값 (정수)
    // 음수 : 이 객체가 저 객체보다 작다
    // 0 : 이 객체와 저 객체는 같다
    // 양수 : 이 객체가 저 객체보다 크다

    static class Person implements Comparable<Person>{
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Person other) {
            // 나이에 따라서 정렬하고 싶음 ( 양수(큼), 0(같음), 음수(작음) )
            return this.age - other.age;
        }

        @Override
        public String toString() {
            return name + ": " + age;
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person("홍길동", 30);
        Person person2 = new Person("임꺽정", 40);
        Person person3 = new Person("전우치", 20);
        Person person4 = new Person("이몽룡", 30);

        int compareInt1 = person1.compareTo(person2);
        int compareInt2 = person1.compareTo(person3);
        int compareInt3 = person1.compareTo(person4);

        System.out.println("compareInt1 = " + compareInt1);
        System.out.println("compareInt2 = " + compareInt2);
        System.out.println("compareInt3 = " + compareInt3);

        // compareTo 기준으로 자동 정렬
        TreeSet<Person> personTreeSet = new TreeSet<>();
        personTreeSet.add(person1);
        personTreeSet.add(person2);
        personTreeSet.add(person3);
        personTreeSet.add(person4);

        // treeSet에서는 중복된 값 안나옴
        for (Person person : personTreeSet){
            System.out.println(person);
        }

    }
}
