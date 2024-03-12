package collection.list;

import java.util.ArrayList;
import java.util.List;

public class List1 {
    public static void main(String[] args) {
        // 컬렉션 프레임워크의 핵심 인터페이스 중 하나
        // 구현 클래스
        // ArrayList
        // LinkedList
        // Vector
        // Stack
        // 특징
        // 순서가 있는 데이터의 집합을 다룸
        // 중복된 요소를 허용
        List<String> names = new ArrayList<>();  // 길이 10짜리 배열 생성
        names.add("홍길동");       // 리스트 맨 끝에 객체를 추가
        names.add("임꺽정");
        names.add("이몽룡");
        System.out.println(names);  // 리스트를 출력

        names.add(1, "이순신");    // 해당 인덱스 위치에 객체 추가
        System.out.println(names);

        names.set(2, "전우치");        // 특정 인덱스의 객체를 변경
        System.out.println(names);

        // 요소 접근
        System.out.println("3번 인덱스 요소 : " + names.get(3));

        // 객체 저장 여부 확인 -> boolean
        System.out.println("이순신 포함 여부 : " + names.contains("이순신"));
        System.out.println("이율곡 포함 여부 : " + names.contains("이율곡"));

        // size : 저장되어있는 전체 객체 수
        System.out.println("저장된 객체수 : " + names.size());

        // isEmpty : 컬렉션이 비어있는 지 여부
        System.out.println("컬렉션이 비어있는 지 여부 : " + names.isEmpty());

        // 요소 제거
        names.remove("전우치");  // 객체로 삭제
        System.out.println(names);
        names.remove(2);    // 인덱스로 삭제
        System.out.println(names);

        // 컬렉션 요소 전체 삭제
        names.clear();
        System.out.println(names);
        System.out.println("컬렉션이 비어있는 지 여부 : " + names.isEmpty());


        /*
        // 데이터가 실제 들어있는 만큼 용량이 조정
        for (String name : names) {
            System.out.println(name.length());
        }

        List<Integer> numbers = new ArrayList<>(20); // 용량 20짜리 배열



        // 배열과의 차이점 : 저장 용량(capacity) 자동으로 증가
        // 객체를 저장할 때 자동으로 인덱스가 부여됨
        String[] nameArray = new String[10];
        nameArray[0] = "이름1";
        nameArray[1] = "이름2";
        nameArray[2] = "이름3";
        // nameArray[3] = null;

   /*     for (String name : nameArray) {
            System.out.println(name.length());
            // name[3].lenght(); <- 비어있어도 최대용량만큼 순회
        }*/
    }
}