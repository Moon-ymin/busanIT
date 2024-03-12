# Java 기초 프로그래밍

## Index
1. 자바 설치 및 IDE 설치와 사용
   - 프로그래밍이란?
   - 주석, 실행문
   - JDK, JRE, JVM
2. [변수](src/variable)
   - 변수 선언, 변수 초기화(Initialize)
   - 변수 사용, 변수 사용범위(Scope)
3. [타입](src/variable)
   - 정수 타입 : int, long
   - 실수 타입 : double
   - 논리 타입 : boolean
4. [타입 변환](src/variable)
   - 자동 타입 변환 (Promotion) : 작은 범위 -> 큰 범위
   - 강제 타입 변환 (Casting) : 큰 범위 -> 작은 범위 (캐스팅 연산자)
5. [연산자](src/operator)
   - 단항 연산자, 이항 연산자, 삼항 연산자
   - 산술 연산자, 대입 연산자, 증감 연산자 등
   - 연산자 우선순위가 존재 : (), ~~~ =
6. [조건문](src/condition)
   - if
   - if-else, if-else-if
   - switch - case
7. [반복문](src/loop) 
   - while
   - for
   - do-while
   - break, continue
8. [배열](src/array)
   - 배열 선언, 배열 초기화, 배열 길이
   - 다차원 배열
   - 향상된 for문
9. [메서드](src/method)
   - 메서드 선언, 메서드 호출
   - 리턴값, 리턴 타입
   - 매개변수(parameter), 인자(argument)
   - 메서드 오버로딩(overloading)
10. [클래스](src/class0) 🌻객체지향의 꽃🌻
    - [객체지향 프로그래밍](src/class1)
      - [OOP 5대 원칙](src/solid)
    - 필드, 생성자, 메서드
    - 패키지
    - [enum](src/enum0)
11. [인스턴스 멤버와 정적 멤버](src/static0)
    - static
    - this 키워드
    - final, 싱글톤
12. [접근 제어자](src/access_modifier)
    - (public > protected > default > private)
    - Getter, Setter 메서드 
13. [패키지](src/package0)
    - package, import
14. [상속](src/inheritance)
    - 부모 생성자 호출 super()
    - 오버라이딩(최우선순위, 메서드 재정의)
    - 타입변환 (업캐스팅, 다운캐스팅)
    - [다형성](src/polymorphism)
15. [추상 클래스](src/polymorphism/abstraction)
    - 인스턴스를 생성하지 못하는 추상적 클래스
    - 추상 메서드 : 본문이 없음. overriding 강제
16. [인터페이스](src/polymorphism/interface0) 
    - 상수와 추상메서드만 존재
    - 다형성
    - 다중 구현(implements)
17. [중첩 클래스](src/nested)
    - 클래스 내부의 클래스
    - 정적 멤버, 인스턴스 멤버, 로컬 멤버
18. [익명 객체](src/nested/anonymous_interface)
    - 이름이 없는 객체
    - 본문이 선언과 동시에 정의 -> 인터페이스 구현
    - 람다식으로 연결 
19. [예외처리](src/exception) 
    - Error, Exception
    - checked 예외(compile), unchecked 예외(runtime)
    - try - catch - finally
    - throws 예외 떠넘기기, throw new 예외 발생시키기, 사용자 정의 예외 
20. [Object 클래스](src/library/lang)
    - 모든 클래스의 조상
    - toString, equals, hashCode, getClass
21. [String 클래스](src/library/lang)
    - 문자열 : immutable
    - 문자열 메서드 : charAt, indexOf, length,
    - replace, substring, trim, split, toLowerCase, toUpperCase,
    - StringBuilder, StringBuffer (변경 가능하게 문자열을 조작 mutable)
22. [Class 클래스](src/library/lang)
    - 클래스에 대한 메타 정보를 가져옴, 조작, 관리 ⇒ 리플렉션
23. [Math, Random 클래스](src/library/util)
24. [Wrapper 클래스]((src/library/lang))
    - 기본 타입을 객체로 포장하는 클래스
25. [날짜와 시간 관련 클래스]((src/library/util))
    - Date, Calender
    - LocalDateTime, LocalDate, LocalTime
    - Period, Duration, DateTimeFormatter
26. [Generic](src/generic)
    - <T> 타입 파라미터를 정의하여 타입이 필요한 자리에 유연한 타입 제공
    - 제네릭 클래스, 제네릭 메서드(리턴 타입 앞에 선언)
    - 제한된 타입 파라미터 <T extends 타입>
    - 와일드 카드 <? extends 타입> <? super 타입>