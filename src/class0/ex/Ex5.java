package class0.ex;

import java.util.Scanner;

public class Ex5 {
    // 4번 연습문제에서 주문을 입력받아 등록하고
    // 총 결제 금액을 만들 수 있도록 수정해주세요
    /* 출력예시
    주문의 개수를 입력하세요:  2
    상품 주문을 입력하세요.
    상품명: 노트북
    가격: 1000000
    수량: 2
    상품 주문을 입력하세요.
    상품명: 마우스
    가격: 50000
    수량: 1

    주문 상품 정보:
    상품명: 노트북, 가격: 1000000원, 수량: 2개
    상품명: 마우스, 가격: 50000원, 수량: 1개
    총 결제 금액: 2050000원
     */

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("주문의 개수를 입력하세요 : ");
        int times = sc.nextInt();

        String[] productNames = new String[times];
        int[] prices = new int[times];
        int[] quantities = new int[times];

        for (int i = 0; i < times; i++) {
            System.out.println("상품 주문을 입력하세요.");
            System.out.print("상품명 : ");
            productNames[i] = sc.next();
            System.out.print("가격 : ");
            prices[i] = sc.nextInt();
            System.out.print("수량 : ");
            quantities[i] = sc.nextInt();
        }

        System.out.println("주문 상품 정보");
        for (int i = 0; i < times; i++) {
            ProductOrder product = createOrder( productNames[i], prices[i], quantities[i]);
            printOrder( product );

        }

        getTotalPayment( prices , quantities );


    }

    public static ProductOrder createOrder( String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    public static void printOrder( ProductOrder p ) {
        System.out.println("상품명 : "+p.productName+", 가격 : "+p.price+"원, 주문 수량 : "+p.quantity+"개");
    }

    public static void getTotalPayment( int[] prices, int[] quantities ) {
        int sum = 0;
        for(int i=0; i<prices.length; i++) {
            sum += prices[i] * quantities[i];
        }
        System.out.println("총 결제 금액 : " + sum);
    }
}
