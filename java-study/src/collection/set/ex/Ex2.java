package collection.set.ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> cities = new HashSet<>();

        while(true) {
            System.out.print("도시 이름을 입력하세요 (종료하려면 '종료' 입력): ");
            String city = sc.nextLine();
            if (!city.equals("종료")) {
                cities.add(city.toLowerCase());
            } else {
                break;
            }
        }
        System.out.println("고유한 도시 이름 목록:");
        for(String city : cities){
            System.out.println(city.substring(0,1).toUpperCase() // 첫 글자는 대문자
            + city.substring(1).toLowerCase());       // 두번째 부터 소문자
        }
    }
}
