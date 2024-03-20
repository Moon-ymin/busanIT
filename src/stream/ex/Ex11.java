package stream.ex;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Ex11 {
    public static void main(String[] args) {
        List<ProductReview> reviews = Arrays.asList(
                new ProductReview("product1", 5),
                new ProductReview("product2", 4),
                new ProductReview("product3", 5),
                new ProductReview("product4", 3),
                new ProductReview("product1", 4)
        );

        OptionalDouble average = reviews.stream()
                .mapToInt(ProductReview::score)
                .average();

        // 수업에서 한 방식
        double avg = reviews.stream()
                .mapToInt(ProductReview::score)
                .average()
                .orElse(Double.NaN);

        long count = reviews.stream()
                .filter(n -> n.score == 5)
                .count();

        System.out.println("평균 리뷰 점수: " + average.getAsDouble());
        System.out.println("5점 리뷰 수: " + count);
    }
    record ProductReview(String productName, int score) {}
}
