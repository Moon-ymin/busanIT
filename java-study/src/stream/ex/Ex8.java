package stream.ex;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Ex8 {
    public static void main(String[] args) {
        Map<String, List<String>> userBookRentals = Map.of(
                "user1", Arrays.asList("The Lord of the Rings", "Java Programming"),
                "user2", Arrays.asList("Java Programming", "Effective Java"),
                "user3", Arrays.asList("The Hobbit"),
                "user4", Collections.emptyList() // 이 사용자는 책을 대출하지 않았습니다.
        );

        boolean isAllRental = userBookRentals.entrySet().stream()
                .anyMatch(rent -> rent.getValue().isEmpty());
        System.out.println(isAllRental ? "책을 대출하지 않은 사용자가 있습니다."
                : "책을 대출하지 않은 사용자가 없습니다.");

        boolean isJava = userBookRentals.entrySet().stream()
                .anyMatch(rent -> rent.getValue().contains("Java Programming"));
        System.out.println(isJava ? "Java Programming 책을 대출한 사용자가 있습니다."
                : "Java Programming 책을 대출한 사용자가 없습니다.");

        boolean isGatsby = userBookRentals.entrySet().stream()
                .anyMatch(rent -> rent.getValue().contains("The Great Gatsby"));
        System.out.println(isGatsby ? "The Great Gatsby 책을 대출한 사용자가 있습니다."
                : "아무도 The Great Gatsby 책을 대출하지 않았습니다.");

        // 수업에서 한 방식
        boolean isAllUserRental = userBookRentals.values().stream()
                .allMatch(bookList -> !bookList.isEmpty());
        // 하나의 책을 대출하지 않은 사람이 한명이라도 있는지
        if (isAllUserRental) {
            System.out.println("모든 사용자가 책을 대출했습니다.");
        } else {
            System.out.println("책을 대출하지 않은 사용자가 있습니다.");
        }
//        - 적어도 한 명의 사용자가 "Java Programming" 책을 대출했는지 검사합니다.
        boolean isAnyRented = userBookRentals.values().stream()
                .anyMatch(bookList -> bookList.contains("Java Programming"));

        if (isAnyRented) {
            System.out.println("Java Programming 책을 대출한 사용자가 있습니다.");
        } else {
            System.out.println("Java Programming 책을 대출한 사용자가 없습니다.");
        }

//        - 어떤 사용자도 "The Great Gatsby" 책을 대출하지 않았는지 검사합니다.
        if (userBookRentals.values().stream()
                .noneMatch(bookList -> bookList.contains("The Great Gatsby"))) {
            System.out.println("아무도 The Great Gatsby 책을 대출하지 않았습니다.");
        } else {
            System.out.println("The Great Gatsby 책을 대출한 사람이 있습니다.");
        }

    }
}
