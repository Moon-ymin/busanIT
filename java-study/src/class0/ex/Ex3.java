package class0.ex;

public class Ex3 {
    public static void main(String[] args) {
        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.productName = "노트북";
        productOrder1.price = 1000000;
        productOrder1.quantity = 2;

        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.productName = "마우스";
        productOrder2.price = 15000;
        productOrder2.quantity = 3;

        ProductOrder productOrder3 = new ProductOrder();
        productOrder3.productName = "키보드";
        productOrder3.price = 5000;
        productOrder3.quantity = 1;

//        ProductOrder[] productOrders = new ProductOrder[3];
//        productOrders[0] = productOrder1;
//        productOrders[1] = productOrder2;
//        productOrders[2] = productOrder3;
        // 생성된 객체를 배열에 저장
        ProductOrder[] productOrders = {productOrder1, productOrder2, productOrder3};
        int sum = 0;

        for (ProductOrder p : productOrders) {
            System.out.println("상품명 : "+p.productName+", 가격 : "+p.price+"원, 주문 수량 : "+p.quantity+"개");
            sum += p.price * p.quantity ;
        }
        System.out.println("총 결제 금액 : " +sum+ "원");
    }
}
