public class Test5 {
    public static void main(String[] args) {
        ProductOrder order1 = new ProductOrder("노트북", 1000000, 2);
        ProductOrder order2 = new ProductOrder("마우스", 15000, 3);
        ProductOrder order3 = new ProductOrder("키보드", 50000,1);

        ProductOrder[] orders = { order1, order2, order3 };

        printOrder( orders );
        getTotalPayment( orders );
    }
    static void printOrder( ProductOrder[] orders ){
        for (ProductOrder o : orders) {
            System.out.printf("상품명: %s, 가격 :%d, 수량 : %d\n", o.productName, o.price, o.quantity);
        }
    }
    static void getTotalPayment( ProductOrder[] orders ){
        int total = 0;
        for ( ProductOrder o : orders ) {
            total += o.price * o.quantity;
        }
        System.out.println("총 결제금액 : " + total + "원");
    }
}
