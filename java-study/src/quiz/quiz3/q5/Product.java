package quiz.quiz3.q5;

import java.util.Objects;

public class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && quantity == product.quantity && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity);
    }

    @Override
    public String toString() {
        return "상품: %s, 가격: %.1f, 수량: %d".formatted(name, price, quantity);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Apple", 2.5, 10);
        Product p2 = new Product("Apple", 2.5, 10);

        System.out.println("equals 메서드 호출 결과: " + p1.equals(p2));
        System.out.println("hashCode 메서드 호출 결과 (product1): " + p1.hashCode());
        System.out.println("hashCode 메서드 호출 결과 (product2): " + p2.hashCode());
        System.out.println("toString 메서드 호출 결과 (product1): " + p1.toString());
        System.out.println("toString 메서드 호출 결과 (product2): " + p2.toString());
    }


}
