package generic.wildcard;

public class Unit {}

class Knight extends Unit {}

class HolyKnight extends Knight {}

// 유닛을 태울 수 있는 말
class Horse<T extends Unit> {
    private T rider;

    public void setRider(T rider) {
        this.rider = rider;
    }
}