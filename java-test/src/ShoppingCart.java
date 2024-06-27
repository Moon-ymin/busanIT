public class ShoppingCart {
    Item[] items;
    int itemCount;

    public ShoppingCart() {
        items = new Item[10];
    }
    public void addItem( Item item ){
        if ( itemCount >= items.length ) {
            System.out.println("장바구니가 가득 찼습니다.");
        } else {
            items[itemCount] = item;
            itemCount++;
        }
    }
    public void displayItems() {
        int sum = 0;
        System.out.println("장바구니 상품 출력");

        for (int i = 0; i < itemCount; i++) {
            System.out.printf("상품명:%s, 합계:%d\n", items[i].name, items[i].price*items[i].quantity);
            sum += items[i].price*items[i].quantity;
        }
        System.out.println("전체 가격 합: " + sum);
    }
}
