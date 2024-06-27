package io_stream.serial;

import java.io.Serializable;

public class Person implements Serializable {
    // SerialVersionID : 직렬화하여 주고받을 해당 클래스의 버전
    // 객체를 보낼쪽과 받을 쪽의 명시된 클래스의 내용이 다를 경우를 대비
    // 직접 지정하지 않으면 자동으로 생성
    /*
        * 객체를 직렬화 한 후 UID를 변경해서 직렬화로 읽어볼 것 *
        -> 예외 발생
        * 필드가 달라도 시리얼ID가 같으면 같은 클래스로 간주 *
            (심각한 데이터 손실 문제 발생 가능성이 있음)
            (심각한 데이터 손실 문제 발생 가능성이 있음)
     */
    private static final long serialVersionUID = 1;
    private String name;
    private int age;
    private double height;
    private boolean married;

    // 직렬화에서 제외하고 싶은 민감 정보
    // transient 를 통해서 제외됨
    transient private double weight;

    // 직렬화에 내부 객체 타입이 있으면 해당 객체도 Serializable 을 구현해야 한다
    private Career career;

    public Person(String name, int age, double height, boolean married, double weight, Career career) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.married = married;
        this.weight = weight;
        this.career = career;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", married=" + married +
                ", weight=" + weight +
                ", career=" + career +
                '}';
    }
}
