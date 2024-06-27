package quiz;

import java.util.Scanner;

public class Quiz5 {
    public static void main(String[] args) {

        ProductOrder order1 = createOrder("노트북", 1000000, 2);
        ProductOrder order2 = createOrder("마우스", 15000, 3);
        ProductOrder order3 = createOrder("키보드",50000,1);

        ProductOrder[] orders = {order1, order2, order3};

        printOrder(orders);

    }
    public static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    public static void printOrder(ProductOrder[] orders) {
        int total = 0;
        for(ProductOrder o : orders ) {
            System.out.printf("상품명 : %s, 가격 : %d, 수량 : %d\n",o.productName, o.price, o.quantity);
            total += o.price * o.quantity;
        }
        System.out.printf("총 결제금액 : %d원", total);
    }


}
