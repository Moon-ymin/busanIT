package condition;

public class Condition6 {
    public static void main(String[] args) {
        // 아이템 가격이 10000원 이상일 때, 1000원 할인
        // 나이가 10살 이하일 때 1000원 할인
        int price = 10000;
        int age = 10;
        int dc = 0;

        if (price <= 10000) {
            dc += 1000;
            System.out.println("만원 이상으로 1000원 할인");
        }
        if (age <= 10) {
            dc += 1000;
            System.out.println("10살 이하라서 1000원 할인");
        }
        System.out.printf("최종 가격은 %d원 입니다.", price - dc );

        // 각각의 조건이 독립 조건일 때 if 문을 개별적으로 사용
        // 모두 연관되는 조건일 때 else - if 문을 사용
    }
}
