package generic.wildcard;

public class HorseShop {
    void addPremium(Horse<? extends Knight> horse) {
        System.out.println("프리미엄 말로 추가");
    }
    void addEntry(Horse<? super Knight> horse) {
        System.out.println("보급형 말로 추가");
    }

    void addBestSeller(Horse<? extends Unit> horse) {
        System.out.println("베스트셀러 말로 추가");
    }
}