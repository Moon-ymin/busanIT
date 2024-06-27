package access_modifier.ex;

import java.util.Arrays;
import java.util.List;

public class ShoppingCart {
    Item[] items;
    int itemCount;

    ShoppingCart() {
        items = new Item[10];
    }
    public void addItem( Item item ){
        if ( itemCount >= 10 ){
            System.out.println("장바구니가 가득 찼습니다.");
        } else {
            // 배열 items에 넣기
            items[itemCount] = item;
            itemCount++;
        }
    }
    public void displayItems(){
        int total = 0;
        System.out.println("장바구니 상품 출력");


        for (int i = 0; i < itemCount; i++) {
            System.out.printf("상품명 : %s, 합계 : %d\n",
                    items[i].getName(), items[i].getPrice() * items[i].getQuantity() );
            total += items[i].getPrice() * items[i].getQuantity();
        }

        System.out.println("전체 가격 합: "+total);
    }
}
