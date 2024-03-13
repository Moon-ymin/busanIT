package collection.list.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        // 수업에서 진행한 방법1
        // 후보 객체가 아니라 리스트 활용해서 하는 방법
        List<String> candidates = new ArrayList<>();    // 후보 정보
        List<Integer> votes = new ArrayList<>();        // 투표 받은 수

        // 후보 목록 등록 ( 초기화 )
        candidates.add("고길동");
        candidates.add("둘리");
        candidates.add("마이콜");
        candidates.add("희동이");

        // 투표 받은 수 초기화
        for (int i = 0; i < candidates.size(); i++) {
            votes.add(0);
        }

        // 투표 받기
        Scanner sc = new Scanner(System.in);

        // 후보 목록 출력하기
        for (int i = 0; i < candidates.size(); i++) {
            System.out.println(i+1+ ". " + candidates.get(i));
        }

        // 투표 받기
        while( true ) {
            System.out.print("투표하고 싶은 후보의 번호를 입력하세요 (종료하려면 0을 입력) : ");
            int choice = sc.nextInt();
            if (choice == 0) {  // 0이면 투표 종료하기
                break;
            } else if (choice < 0 || choice > candidates.size()){
                System.out.println("잘못된 번호입니다. 다시 입력하세요.");
            } else {    // 투표 카운트하기
                Integer vote = votes.get(choice - 1);   // 투표 수 가져오기 (인덱스 주의)
                votes.set(choice - 1, vote + 1);
            }
        }

        System.out.println("[투표 결과] ");
        for (int i = 0; i < candidates.size(); i++) {
            System.out.printf("%s : %d   ", candidates.get(i), votes.get(i));
        }

    }
}
