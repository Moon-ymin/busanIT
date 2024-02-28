package polymorphism.interface0.car;

import access_modifier.first.A;

public class Main {
    public static void main(String[] args) {
        // 운전자 생성
        Driver driver = new Driver();

        // 아반떼 탑승 및 시운전
        Avante avante = new Avante();
        driver.setAvante(avante);
        driver.drive();

        driver.setAvante(null);
        // 소나타 탑승
        Sonata sonata = new Sonata();
        driver.setSonata(sonata);
        driver.drive();
    }
}
