package collection.list.ex.ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VotingSystem {
    private static Scanner sc = new Scanner(System.in);
    public static boolean isFinish = false;
    private List<Candidate> candidates;
    public VotingSystem() {
        candidates = new ArrayList<>();
        candidates.add(new Candidate("고길동"));
        candidates.add(new Candidate("둘리"));
        candidates.add(new Candidate("마이콜"));
        candidates.add(new Candidate("희동이"));
    }

    public void startVoting() { // 투표 프로세스 구현
        System.out.println("후보 목록:");
        for (int i = 0; i < candidates.size(); i++) {
            System.out.println((i+1) + ". " + candidates.get(i).getName());
        }

        System.out.print("투표하고 싶은 후보의 번호를 입력하세요 (종료하려면 0을 입력) : ");
        while (true) {
            int choice = sc.nextInt();
            if (choice == 0) {
                break;
            } else if (choice < 0 || choice > candidates.size()) {
                System.out.println("잘못된 번호입니다. 다시 입력하세요.");
            } else {
                candidates.get(choice - 1).receiveVote();
                System.out.println("투표하고 싶은 후보의 번호를 입력하세요 (종료하려면 0을 입력):");
            }
        }


    }
    public void printResults() {
        System.out.println("투표 결과:");
        for (Candidate candidate : candidates) {
            System.out.println(candidate);
        }
    }
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
        votingSystem.startVoting();
        votingSystem.printResults();
    }

}
