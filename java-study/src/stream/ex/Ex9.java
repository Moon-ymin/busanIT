package stream.ex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Ex9 {
    public static void main(String[] args) {
        List<BookRental> rentals = Arrays.asList(
                new BookRental("user1", 3),
                new BookRental("user2", 5),
                new BookRental("user3", 1),
                new BookRental("user4", 2)
        );
        // 1.
        int sum = rentals.stream()  // 객체 스트림
                .mapToInt(BookRental::quantity) // 정수 스트림
                .sum();
        System.out.println("전체 대여된 책의 수량: "+sum);
        // 2. 가장 많은 책을 대여한 사용자
        Optional<BookRental> first = rentals.stream()
                .sorted(Comparator.comparing(BookRental::quantity).reversed())
                .findFirst();
        System.out.println("가장 많은 책을 대여한 사용자: " + first.get().userId);
        // 수업에서 한 방식
        Optional<BookRental> max = rentals.stream()
                .max(Comparator.comparing(BookRental::quantity));
        System.out.println("가장 많은 책을 대여한 사용자: " + max.get().userId);

        // Optional의 map은 변환된 Optional을 반환함.
        String topUserId = rentals.stream()
                .max(Comparator.comparing(BookRental::quantity))
                .map(bookRental -> bookRental.userId)
                .orElse("찾지 못했습니다.");

        System.out.println("가장 많은 책을 대여한 사용자: " + topUserId);
    }
    record BookRental(String userId, int quantity) {}
}
