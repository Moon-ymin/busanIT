package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream12 {
    // 병렬 스트림 :
    // 멀티 코어 CPU 에서 전체 요소를 분할해서 각각의 코어가 병렬적으로 처리하는 것
    // 목적 : 작업 처리 시간을 줄이는 것
    // 동시성 : Concurrency
    // 여러개의 스레드가 하나의 코어에서 번갈아가면서 실행
    // 병렬성 : Parallelism
    // 멀티 코어에서 각각의 작업을 병렬로 실행하는 것

    // 자바 병렬 스트림에서는
    // Fork / Join Framework
    // Fork : 데이터의 스트림을 쪼개어서 멀티 코어에 나누어 줌 -> 병렬로 처리
    // 각각의 포크에서 작업 결과를 가져와서
    // Join : 나누어져 처리된 작업결과들을 부분 결합하고 최종 결합하여 결과 산출
    public static void main(String[] args) {
        // 병렬 스트림 생성하기
        List<String> stringList = Arrays.asList(
                "a", "b", "c", "d", "e", "f", "g", "h"
        ) ;
        Stream<String> stringStream = stringList.parallelStream();

        // 기존 스트림을 병렬 스트림으로 전환
        Stream<String> parallel = stringList.stream().parallel();

        // 병렬 스트림 여부 확인
        boolean isParallel = parallel.isParallel();
        boolean notParallel = stringList.stream().isParallel();
        System.out.println("isParallel = " + isParallel);
        System.out.println("notParallel = " + notParallel);

        // 1~nCount 번만큼 랜덤한 숫자를 제곱할 때
        // 순차 스트림과 병렬 스트림 시간 비교
        int nCount = 100_000_000;       // 바꿔가며 비교
        List<Integer> list = new ArrayList<>();

        // 랜덤한 숫자 추가
        for (int i = 0; i < nCount; i++) {
            list.add(new Random().nextInt());
        }

        // 순차 스트림 성능
        long startTimeSeq = System.currentTimeMillis();

        list.stream()
                .map(n -> n * n)
                .forEach(n -> {});

        long endTimeSeq = System.currentTimeMillis();

        System.out.println("순차 스트림 처리 시간 : " + (endTimeSeq - startTimeSeq));

        // 병렬 스트림 성능
        long startTime = System.currentTimeMillis();

        list.parallelStream()
                .map(n -> n * n)
                .forEach(n -> {});

        long endTime = System.currentTimeMillis();

        System.out.println("병렬 스트림 처리 시간 : " + (endTime - startTime));

    }
}