package collection.ex;

import java.util.LinkedList;
import java.util.Queue;

public class Ex4 {
    /*
    문제 : 인쇄 작업 대기열 (Queue 활용)
    사무실 인쇄기에서 여러 사용자의 인쇄 요청을 순서대로 처리할 수 있도록 큐를 활용하는 프로그램을 작성하세요. 사용자가 인쇄 요청을 할 때마다 해당 요청을 큐에 추가(offer)하고, 인쇄기는 큐에서 대기 중인 요청을 순서대로 가져와(poll) 처리합니다.

    요구사항:
    사용자의 인쇄 요청을 순서대로 큐에 추가합니다.
    큐가 비어있지 않은 동안, 인쇄 작업을 순서대로 처리하고, 처리된 작업을 큐에서 제거합니다.

    데이터 예시:
    과제.hwp
    보고서.docx
    자료.pdf

    출력 예시:
    과제.hwp 인쇄 중...
    보고서.docx 인쇄 중...
    자료.pdf 인쇄 중...
     */
    static class Document {
        String name;
        public Document(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name + " 인쇄 중..";
        }
    }

    public static void main(String[] args) {
        Queue<Document> printQueue = new LinkedList<>();

        printQueue.offer(new Document("과제"));
        printQueue.offer(new Document("보고서.docx"));
        printQueue.offer(new Document("자료.pdf"));

        while (!printQueue.isEmpty()) {
            Document poll = printQueue.poll();
            System.out.println(poll);
        }
    }
}
