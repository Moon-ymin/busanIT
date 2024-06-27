package library.lang;

// 자바 Record
// 자바 14버전부터 새롭게 도입된 데이터 구조
// VD(Value Object) 객체 또는 DTO(Data Transfer Object)를 작성할 때
// 불변하는 데이터 객체를 간단하게 정의해주는 자료구조
record Human(String name, int age) {}
// 컴파일러가 자동으로 기본생성자, getter, equals, hashCode, toString을 생성

public class Record{
    public static void main(String[] args) {
        Human human = new Human("홍길동", 30);

        // getter 메서드와 동일한 효과를 내는 메서드
        int age = human.age();
        String name = human.name();

        // toString method 오버라이딩
        System.out.println(human.toString());

        // equals 도 오버라이딩
        Human human2 = new Human("홍길동", 30);
        Human human3 = new Human("임꺽정", 40);
        System.out.println("필드 값이 같을 때 : " + human.equals(human2));
        System.out.println("필드 값이 다를 때 : " + human.equals(human3));

        // hashCode 오버라이딩
        System.out.println("기본 해시코드 : " + human.hashCode());
        System.out.println("데이터가 같은 경우 : " + human2.hashCode());
        System.out.println("데이터가 다른 경우 : " + human3.hashCode());
    }
}

// 레코드는 final 키워드가 적용이 되어 더 이상 상속되지 않는다.
//class StringHuman extends Human
