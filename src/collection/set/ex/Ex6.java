package collection.set.ex;

import collection.set.Compare;

import java.time.LocalDateTime;
import java.util.TreeSet;

public class Ex6 {
    static class Reservation implements Comparable<Reservation> {
        LocalDateTime start;
        String name;
        String place;

        public Reservation(LocalDateTime start, String name, String place) {
            this.start = start;
            this.name = name;
            this.place = place;
        }

        @Override
        public String toString() {
            return "예약 시간: "+start+", "+place+", "+name;
        }

        @Override
        public int compareTo(Reservation o) {
            return this.start.compareTo(o.start);
        }
    }
        public static void main(String[] args) {
        Reservation r1 = new Reservation(LocalDateTime.of(2023, 10, 10, 12,0), "홍길동", "회의실");
        Reservation r2 = new Reservation(LocalDateTime.of(2023, 10, 10, 10, 0), "김길동","회의실");
        Reservation r3 = new Reservation(LocalDateTime.of(2023, 10, 11, 10, 0),"홍길남","회의실");
        Reservation r4 = new Reservation(LocalDateTime.of(2023, 10, 10, 15, 0),"홍길서","회의실");

        TreeSet<Reservation> reservations = new TreeSet<>();
        reservations.add(r1);
        reservations.add(r2);
        reservations.add(r3);
        reservations.add(r4);

        for(Reservation r : reservations){
            System.out.println( r.toString() );
        }

    }
}
