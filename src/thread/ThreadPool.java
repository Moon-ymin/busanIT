package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    // 스레드풀 : 재사용 가능한 스레드들의 집합
    // 필요할 때마다 스레드를 새로 생성하는 대신 이미 생성된 스레드를 재사용하여
    // 스레드 생성, 제거에 따른 오버헤드(간접비)를 줄이고 자원 관리 효율성 높임.

    // 1. 스레드풀에 작업 처리 요청
    // 2. 작업 큐에 대기
    // 3. 각 스레드는 큐에서 작업을 가져와서 스레드 풀이 최대 개수만큼 처리
    // 4. 결과를 전달하고, 다음 작업을 대기

    // java.util.concurrent
    // ExecutorService 스레드 풀 관리와 실행을 위한 인터페이스
    // ExecutorService 생성
    // Executors.newFixedThreadPool : 초기 스레드 수 0개, 최대 n개 생성 가능

    // 작업 처리
    // execute : Runnable 을 작업 처리 큐에 저장 (리턴 값이 없음)
    // submit : Callable 을 작업 처리 큐에 저장 (리턴 값이 있음. Future 타입)
    public static void main(String[] args) {
        List<Email> emails = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            emails.add(
                    new Email("admin@busanit.com",
                            "member"+i+"@busanit.com",
                            "새로운 과정이 개설되었습니다!"));
        }

        // 스레드풀에 스레드 갯수를 지정하여 생성
        ExecutorService executorService = Executors.newFixedThreadPool(100);

        // 스레드 풀 작업...
        emails.forEach(email ->
                executorService.execute(() -> {
                    Thread thread = Thread.currentThread();
                    String logMessage = String.format("[%s] %s ==> %s : %s",
                            thread.getName(), email.from(), email.to(), email.content());
                    System.out.println(logMessage);
                })
        );

        // 스레드풀 종료
        executorService.shutdown();


    }
}

// 이메일 정보를 저장하기 위한 클래스
record Email(String from, String to, String content) {}