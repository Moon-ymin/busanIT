package variable;

public class Type1 {
    public static void main(String[] args) {
        int a = 1;
        double b = 1.1;
        boolean c = true; // 참-거짓 논리값

        char d = 'a'; // 캐릭터, 문자하나, 홑따옴표
        char d1 = 97; // 아스키코드로 표현
        char d2 = '\u0061'; // 유니코드로 표현

        String e = "안녕하세요"; // 문자열, 쌍따옴표 리터럴 방식(고정된 값 대입)
        String e1 = new String("안녕하세요"); // new 키워드 객체생성에 사용, 항상 새로운 String 객체 만듦

        /* Primitive 원시자료형 = int, long, double, float, boolean, char
        은 new 키워드로 값을 생성할 수 없고, 리터럴 표기 방식으로만 값 세팅
        String은 리터럴 가능하지만, 원시 자료형에 포함되지 않는다.
        */

        /* 문자열 내장 메서드
        1. equals : 문자열 2개가 같은지 비교 a.equals(b)
           primitive는 == 연산 가능
        2. indexOf : 문자열에서 특정 문자열이 시작되는 위치(인덱스값) 리턴
           String a = "Hello Java"; a.indexOf("Java") -> 6
        3. contains : 문자열에서 특정 문자열이 포함되어 있는지 여부 리턴
           a.contains("Java"); -> true
        4. charAt : 문자열에서 특정 위치의 문자를 리턴
           a.charAt(6); -> J
        5. replaceAll : 문자열에서 특정 문자열을 다른 문자열로 바꿀 떄
           a.replaceAll("Java", "World"); -> Hello World
        6. substring : 문자열에서 특정 문자열을 뽑아낼 때 사용
           a.substring(0,4); -> Hell
        7. toUpperCase : 문자열을 모두 대문자로 변경
           a.toUpperCase(); -> HELLO JAVA
        8. split : 문자열을 특정한 구분자로 나누어 문자열 배열로 리턴
           String a = "a:b:c"; a.split(":"); -> {"a", "b", "c"}
        */

        /* 문자열 포매팅 : 문자열 안에 어떤 값 삽입
        1. String.format : 숫자 바로 대입
           String.format("I eat %d apples.", 3); -> I eat 3 apples.
           String.format("I eat %s apples.", "two"); -> I eat two apples.
        2. 숫자값 가지는 변수 사용
           int num = 3; String.format("I eat %d apples.", num);
        3. 값 2개 이상 넣기
           String day = "two"; String.format("I ate %d apples. I was sick for %s days", num, day);
        => %s, %c, %d, %f(부동소수), %o(8진수), %x(16진수), %%(Literal %)
        */

        /* 문자열 포맷 코드 응용
        1. 정렬과 공백
           String.format("%10s", "hi"); ->  (전체 길이 10, 공백 8) hi
           왼쪽 정렬
           String.format("%-10sjane", "hi"); -> hi (공백 8) jane
        2. 소수점 표현
           String.format("%.4f", 3.42134234); -> 3.4213
           String.format("%10.4f", 3.42134234); -> (공백4개)3.4213
        3. System.out.printf
           String.format 메서드 없어도 됨
           System.out.println(String.format(~)); -> System.out.printf(~);
         */
    }
}
