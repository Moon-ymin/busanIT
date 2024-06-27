package collection.set.ex;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.TreeSet;

public class Ex7 {
    /*
    연습문제: 회의실 예약 시스템 (확장)

    기존 온라인 회의실 예약 시스템에서 Comparator를 구현하여
    이름과 장소 기준으로 정렬하는 방법을 추가합니다.

    Comparator 구현:
    Reservation 객체들을 이름과 장소를 기준으로 정렬하는 Comparator 구현.

    새로운 TreeSet 생성:
    생성자에서 구현된 Comparator를 매개변수로 받는 TreeSet을 생성하고
    여러 Reservation 객체를 TreeSet에 추가합니다.
    이름과 장소 기준으로 정렬된 TreeSet의 요소들을 출력합니다.
     */

    public static void main(String[] args) {

        Comparator<Reservation> nameComparator = new Comparator<>() {

            @Override
            public int compare(Reservation o1, Reservation o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        TreeSet<Reservation> reservationTreeSet = new TreeSet<>(nameComparator);

        reservationTreeSet.add(new Reservation(
                LocalDateTime.of(2024, 03, 13, 11, 00),
                "홍길동",
                "회의실A"
        ));
        reservationTreeSet.add(new Reservation(
                LocalDateTime.of(2024, 03, 13, 9, 00),
                "홍길동",
                "회의실B"
        ));
        reservationTreeSet.add(new Reservation(
                LocalDateTime.of(2024, 03, 12, 23, 00),
                "김길동",
                "회의실C"
        ));

        for (Reservation reservation : reservationTreeSet) {
            System.out.println(reservation);
        }
    }
}
