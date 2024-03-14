package collection.set.ex;

import java.time.LocalDateTime;

public class Reservation implements Comparable<Reservation> {
    private LocalDateTime start;
    private String name;
    private String place;

    public Reservation(LocalDateTime start, String name, String place) {
        this.start = start;
        this.name = name;
        this.place = place;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public int compareTo(Reservation other) {
        // 날짜와 시간 객체끼리 비교
        return start.compareTo(other.getStart());
    }

    @Override
    public String toString() {
        return "예약시간 : " + start + ", 이름 : " + name + ", 장소 : " + place;
    }
}
