package thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class Thread15 {
    // 스레드 안전한 컬렉션
    // Thread Safety : 여러 스레드에서 동시에 같은 코드 영역에 접근해도,
    // 실행 결과가 예측가능하게 올바르게 유지되는 것을 보장
    public static void main(String[] args) {
        // 스레드 안전하지 않은 컬렉션
        List<Integer> unsafeList = new ArrayList<>();       // Vector로 바꾼 후 실행

        // 각각의 작업은 리스트에 1000개를 추가
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                unsafeList.add(i);
            }
        };

        // 두 개의 스레드에서 각 task를 수행
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        // 스레드 시작(new -> runnable)
        thread1.start();
        thread2.start();

        // 메인스레드에서 각 스레드가 종료하기를 기다림
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("ArrayList 리스트의 사이즈는? " + unsafeList.size());

        ////////////////////////////////////////////////////////////////

        // 1. 스레드 안전한 컬렉션 : Vector
        //List<Integer> safeList = new Vector<>();

        // 2. 동기화 래퍼 : Collections.synchronizedList
        //List<Integer> safeList = Collections.synchronizedList(new ArrayList<>());

        // 3. java.util.concurrent 패키지의 동기화 안전 컬렉션 : CopyOnWriteArrayList
        List<Integer> safeList = new CopyOnWriteArrayList<>();

        // 각각의 작업은 리스트에 1000개를 추가
        Runnable task2 = () -> {
            for (int i = 0; i < 1000; i++) {
                safeList.add(i);
            }
        };

        // 두 개의 스레드에서 각 task를 수행
        Thread thread3 = new Thread(task2);
        Thread thread4 = new Thread(task2);

        // 스레드 시작(new -> runnable)
        thread3.start();
        thread4.start();

        // 메인스레드에서 각 스레드가 종료하기를 기다림
        try {
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("스레드 안전한 리스트의 사이즈는? " + safeList.size());

    }
}