public class Test7 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("당근", 1500, 3);
        Item item2 = new Item("양파", 2000, 5);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.displayItems();
    }
}
