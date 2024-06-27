package polymorphism.interface0.ex.ex5;

public class Ex5 {
    public static void main(String[] args) {
        Attackable[] attackUnits = {new Marine(), new SiegeTank()};
        Movable[] moveUnits = {new Marine(), new Observer()};

        for (Attackable unit : attackUnits) {
            unit.attack();
        }

        for (Movable unit : moveUnits) {
            unit.move();
        }

        // SupplyDepot는 Attackable이나 Movable 인터페이스를 구현하지 않았으므로,
        // 공격이나 이동 메서드를 호출할 수 없습니다.
        SupplyDepot depot = new SupplyDepot();
        depot.provideSupply(); // 공급 기능만 수행
    }
}
