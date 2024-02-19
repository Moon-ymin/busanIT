package class0.ex;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        // 1. 동물(Animal) 클래스를 정의
        // 동물의 종류, 이름, 나이를 데이터로 가지고 동물의 정보를 출력하는 메서드를 가짐
        // 2. 해당 클래스를 메인메소드에 생성하고 사용해보세요

        Animal animal = new Animal();

        Scanner sc = new Scanner(System.in);
        System.out.print("알고싶은 동물은? (닭/강아지/고양이) : ");
        String type = sc.next();

        if (type.equals("닭")) {
            animal.Information(0);
        } else if (type.equals("강아지")) {
            animal.Information(1);
        } else if (type.equals("고양이")) {
            animal.Information(2);
        } else {
            System.out.println("동물의 정보가 없습니다.");
        }
    }
}
