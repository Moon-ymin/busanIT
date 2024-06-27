package quiz.quiz5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Candidate> candidates = new ArrayList<>();
        candidates.add(new Candidate("고길동"));
        candidates.add(new Candidate("둘리"));
        candidates.add(new Candidate("마이콜"));
        candidates.add(new Candidate("희동이"));
        boolean isFinish = false;

        while(!isFinish) {
            System.out.println("""
                    후보 목록:
                         1. 고길동
                         2. 둘리
                         3. 마이콜
                         4. 희동이
                    """);
            System.out.print("투표하고 싶은 후보의 번호를 입력하세요 (종료하려면 0을 입력): ");
            int choice = sc.nextInt();
            if (choice != 0) {
                candidates.get(choice-1).plusVote();
            } else if (choice == 0) {
                System.out.println("투표를 종료합니다.");
                isFinish = true;
            }
        }
        System.out.println("투표 결과:");
        for (int i = 0; i < candidates.size(); i++) {
            System.out.println(candidates.get(i).toString());
        }

    }
}

class Candidate{
    String name;
    int votes;

    public Candidate(String name) {
        this.name = name;
        this.votes = 0;
    }
    public void plusVote() {
        votes++;
    }
    public String getName() {
        return name;
    }

    public int getVotes() {
        return votes;
    }

    @Override
    public String toString() {
        return name + ": " + votes;
    }
}
