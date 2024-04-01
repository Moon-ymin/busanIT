package quiz.quiz6;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class q5 {
    public static void main(String[] args) {
        List<ProductReview> reviews = Arrays.asList(
                new ProductReview("product1", 5),
                new ProductReview("product2", 4),
                new ProductReview("product3", 5),
                new ProductReview("product4", 3),
                new ProductReview("product1", 4)
        );

        int five = 0;
        int sum = 0;
        for (ProductReview review : reviews) {
            if (review.score == 5) {
                five++;
            }
            sum += review.score;
        }
        System.out.println("평균 리뷰 점수: " + (double)sum/reviews.size());
        System.out.println("5점 리뷰 수: " + five);
    }
    public static class ProductReview {
        String productID;
        Integer score;

        public ProductReview(String productID, Integer score) {
            this.productID = productID;
            this.score = score;
        }
    }
}
