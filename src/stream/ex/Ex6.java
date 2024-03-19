package stream.ex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex6 {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 999.99, 250),
                new Product("Smartphone", 499.99, 300),
                new Product("Tablet", 199.99, 300),
                new Product("Smartwatch", 199.99, 150)
        );
        // 리뷰수 많은 순 -> 가격이 낮은 순 정렬
        products.stream()
                .sorted(Comparator.comparing(Product::getReviews).reversed()
                        .thenComparing(Product::getPrice))
                .forEach(System.out::println);


    }
}

class Product {
    String name;
    double price;
    int reviews;

    Product(String name, double price, int reviews) {
        this.name = name;
        this.price = price;
        this.reviews = reviews;
    }

    // Getter 메서드
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getReviews() {
        return reviews;
    }

    @Override
    public String toString() {
        return name + " - $" + price + ", Reviews: " + reviews;
    }
}
