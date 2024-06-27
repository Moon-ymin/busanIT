## private static final과 private final의 차이
- https://dejavuhyo.github.io/posts/java-private-static-final-vs-private-final/
1. static 
   1. JVM의 static 메모리에 올라감
   2. static 데이터는 프로그램 실행 직후부터 끝날 때까지 메모리 수명이 유지
   3. 초기화 과정 필요 없이 static이 선언된 변수, 메서드에 바로 접근
   4. 해당 객체를 공유하겠다는 의미, 다른 곳에서 해당 객체를 사용한다면 그 객체는 항상 동일한 객체라는 의미

2. final
   1. 불변한게 아니라 재할당할 수 없도록 만드는 것
   2. 상속하거나, 최초 초기화 이후 다시 초기화할 수 없다

3. private static final - private final 차이
   1. private static final
      - `private static final`을 선언한 변수를 사용하면 재할당하지 못하며, 메모리에 한 번 올라가면 같은 값을 클래스 내부의 전체 필드, 메서드에서 공유한다
   2. private final
      - `private final`을 선언한 변수를 사용하면 재할당 못하고
      - 해당 필드, 메서드별로 호출할 때마다 새로이 값을 할당(인스턴스화)한다

## 자바에서 포인터가 아닌 참조(Reference) 자료형을 사용하는 이유
- https://you88.tistory.com/34
1. 포인터와 참조 자료형의 차이
    - 포인터
        - 임의의 메모리 주소를 저장 가능
        - 포인터에 잘못된 주소 저장할 수도(segment fault)
    - 참조 자료형
        - 임의의 메모리 주소를 저장 못함
        - `new`로 객체 선언, JVM이 대신 참조 자료형에 객체의 주소를 저장
2. 자바는 왜 참조 자료형?
    - 자바만의 특징, `JVM(JAVA Virtual Machine) & GC(Garbage Collector)`
    - 객체 생성 과정에서 Heap 영역의 객체 주소는 고정적이지 않음
      → 포인터 허용해버리면 GC에 의해 주소값이 바뀌어 엉뚱한 주소에 접근
3. 장단점
   1. 메모리 설정 자율성 : 개발자가 임의로 메모리 값을 설정하고 해당 메모리에 직접 접근이 가능한 포인터가 자율성 높음
   2. 메모리 관리 편의성 : GC를 사용해 개발자 대신 참조되지 않는 메모리는 자동으로 해제하는 자바가 메모리 관리 효율적
   3. 안전성 : 포인터는 `segment fault`위험, 자바는 `JVM`과 `GC`로 스스로 메모리 관리하고 개발자가 직접적인 메모리 접근을 막아 더 안전
   4. 성능 : JVM과 GC는 자체적으로 리소스 소비, 포인터가 더 우세