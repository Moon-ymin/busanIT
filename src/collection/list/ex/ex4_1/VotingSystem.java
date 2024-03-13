package collection.list.ex.ex4_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 수업에서 한 방식2
// 후보자 객체로 받기

public class VotingSystem {
    // 필드 : 후보 정보를 가지고 있는 List
    List<Candidate> candidates = new ArrayList<>();

    // 생성자 : 후보 정보를 초기화


    public VotingSystem(List<Candidate> candidates) {
        this.candidates = candidates;
    }

    // 메서드 : 투표를 시작하는 로직
    public void startVoting() {
        // 후보목록 출력하기
        for (int i = 0; i < candidates.size(); i++) {
            System.out.println((i + 1) + ". " + candidates.get(i).getName());
            // 번호           리스트.후보객체.이름문자열
        }


        // 투표 받기
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("투표하고 싶은 번호를 입력하세요. 종료는 0 > ");
            int choice = scanner.nextInt();

            // 0이면 투표 종료하기
            if (choice == 0) break;
            else if (choice > 0 && choice <= candidates.size()) {
                int realIndex = choice - 1;
                // 투표 카운트하기
                candidates
                        .get(realIndex)     // 후보 객체 가져오기
                        .receiveVote();     // 후보의 투표수 늘리기
            } else {
                System.out.println("번호를 맞게 입력해주세요");
            }
        }

        // 반복문 빠져나올 시 투표결과 출력
        printResult();
    }

    void printResult() {
        // 투표결과 출력
        System.out.print("[투표결과] ");
        for (Candidate candidate : candidates) {
            System.out.printf("%s : %d   ", candidate.getName(), candidate.getVotes());
        }

    }

    public static void main(String[] args) {
        // 투표 시스템 후보등록 초기화
        VotingSystem votingSystem = new VotingSystem(
                List.of(new Candidate("고길동"),
                        new Candidate("둘리"),
                        new Candidate("마이콜"),
                        new Candidate("영희")
                ));

        // 투표 시작
        votingSystem.startVoting();
    }
}
