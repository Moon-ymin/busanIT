package inheritance;

public class Ingeritance1 {
    public static void main(String[] args) {

        // 자식 객체를 생성하면, 상속관계 있는 부모까지 포함해서 인스턴스가 생성된다
        // (2가지의 클래스 정보가 공존) (부모 인스턴스 먼저 출력)
        // petroCar.move()를 호출하면 먼저 참조된 주소로 접근하여
        // 자식타입(자기자신)을 찾아서 메서드가 존재하는지 찾고,
        // 없으면, 부모타입에서 찾아서 메서드를 호출한다.

        PetroCar petroCar = new PetroCar();
        petroCar.move();
        petroCar.fillUp();

        ElectricCar electriccar = new ElectricCar();
        electriccar.move();
        electriccar.charge();

        HydroCar hydroCar = new HydroCar();
        hydroCar.move();
        hydroCar.fillHydro();
    }
}
