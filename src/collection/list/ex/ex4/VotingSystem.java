package collection.list.ex.ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VotingSystem {
    private static Scanner sc = new Scanner(System.in);
    public static boolean isFinish = false;
    List<Candidate> candidates;
    public VotingSystem() {
        candidates = new ArrayList<>();
        candidates.add(new Candidate("고길동", 0));
        candidates.add(new Candidate("둘리", 0));
        candidates.add(new Candidate("마이콜", 0));
        candidates.add(new Candidate("희동이", 0));
    }
    public static void receiveVote() {

    }
    public static boolean startVoting() { // 투표 프로세스 구현
        System.out.print("투표하고 싶은 후보의 번호를 입력하세요 (종료하려면 0을 입력) : ");
        int number = sc.nextInt();
        if (number <= candidates.size()) {
            switch (number){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    System.out.println("투표를 종료합니다.");
                    isFinish = true;
                    break;
            }
            return isFinish;
        } else {
            System.out.println("없는 후보입니다.");
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Candidate> candidate = new VotingSystem();

        System.out.println("후보 목록:"+ candidate );
        while(!isFinish) {
            isFinish = startVoting();
        }
    }

}
