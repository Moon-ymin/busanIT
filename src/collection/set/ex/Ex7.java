package collection.set.ex;

import collection.set.Compare2;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class Ex7 {
    static class Reservation{
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
            return "예약 시간: %o, %s, %s".formatted(start, place, name);
        }



    }

    public static void main(String[] args) {
        Comparator<Reservation> namecomparator = new Comparator<Reservation>() {
            @Override
            public int compare(Reservation o1, Reservation o2) {
                return o1.name.compareTo(  o2.name);
            }
        };
        Comparator<Reservation> placecomparator = new Comparator<>() {
            @Override
            public int compare(Reservation o1, Reservation o2) {
                return o1.place.compareTo(  o2.place);
            }
        };
        TreeSet<Reservation> treeSet = new TreeSet<>( );

    }
}
