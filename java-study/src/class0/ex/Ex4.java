package class0.ex;

public class Ex4 {
    // 3번 연습문제를 리팩토링하세요
    // createOrder 메소드를 통해 상품주문 객체를 생성해주세요
    // printOrder 메소드를 통해 상품 정보를 출력해주세요
    // getTotalPayment 메소드를 통해 총 결제 금액을 구해주세요

    public static void main(String[] args) {
        ProductOrder product1 = createOrder("노트북", 1000000, 2);
        ProductOrder product2 = createOrder("마우스", 15000, 3);
        ProductOrder product3 = createOrder("키보드", 5000, 1);

        // 생성한 객체를 배열에 저장
        ProductOrder[] orders = { product1, product2, product3 };

        // 객체 정보 출력
        printOrder( product1 );
        printOrder( product2 );
        printOrder( product3 );

        // 최종 결제 금액 출력
        getTotalPayment( orders );


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

    public static void getTotalPayment( ProductOrder[] orders ) {
        int sum = 0;
        for(ProductOrder order : orders) {
            sum += order.price * order.quantity;
        }
        System.out.println("총 합계 : " + sum);
    }

}
