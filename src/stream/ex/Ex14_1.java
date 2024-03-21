package stream.ex;

import java.util.*;
import java.util.stream.Collectors;

public class Ex14_1 {
    // 수업에서 한 방식
    record Book(String title, String genre, String author, int publishYear, int pages) {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Book> books = Arrays.asList(
                new Book("Java의 정석", "컴퓨터 과학", "남궁성", 2013, 1024),
                new Book("모비 딕", "소설", "허먼 멜빌", 1851, 635),
                new Book("클린 코드", "컴퓨터 과학", "로버트 C. 마틴", 2008, 464),
                new Book("햄릿", "연극", "윌리엄 셰익스피어", 1603, 500),
                new Book("데미안", "소설", "헤르만 헤세", 1919, 248),
                new Book("Effective Java", "컴퓨터 과학", "조슈아 블로크", 2018, 412)
        );

        while (true) {
            System.out.print("""
                    1. 모든 책의 평균 페이지 수 계산
                    2. 특정 장르 책의 평균 출판년도 계산
                    3. 특정 연도 이후 출판된, 최소 페이지 이상 책의 제목 출력
                    4. 각 장르별 책의 수 계산
                    5. 가장 많은 책이 출판된 장르 찾기
                    0. 종료
                    실행할 작업을 선택하세요: """
            );

            int choice = scanner.nextInt();
            // 2(개행:enter)  2 -> choice
            // (enter) nextLine
            scanner.nextLine();     // (enter) 개행문자를 비워줌


            switch (choice) {
                case 1:
                    q1(books);
                    break;
                case 2:
                    System.out.print("장르를 입력하세요 ");
                    // (enter)<한줄
                    String genre = scanner.nextLine();
                    q2(books, genre);
                    break;
                case 3:
                    System.out.print("조회할 최소 연도를 입력하세요 ");
                    int year = scanner.nextInt();
                    System.out.print("조회할 최소 페이지 수를 입력하세요 ");
                    int page = scanner.nextInt();
                    q3(books, year, page);
                    break;
                case 4:
                    q4(books);
                    break;
                case 5:
                    q5(books);
                    break;
                case 6:
                    System.out.print("검색할 키워드를 입력해주세요: ");
                    String query = scanner.nextLine();
                    q6(books, query);
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }

        }
    }
    private static void q6(List<Book> books, String query) {
        List<Book> list = books.stream().
                filter(book -> book.title.contains(query)       // 책의 이름과 저자로 검색
                        || book.author.contains(query))
                .toList();
        list.forEach(System.out::println);      // 검색된 책의 목록 출력
    }

    private static void q3(List<Book> books, int year, int page) {
        List<String> titleList = books.stream()
                .filter(book ->
                        book.publishYear > year
                                && book.pages >= page)
                .map(Book::title)
                .collect(Collectors.toList());
        System.out.printf("%d년 이후에 출판된 책들 중 페이지 수가 %d페이지 이상인 책의 제목 = %s\n", year, page, titleList);
    }

    private static void q5(List<Book> books) {
        Map<String, Long> genreBookMap = books.stream()
                .collect(Collectors.groupingBy(Book::genre,
                        Collectors.counting()));
        String maxGenre = genreBookMap.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse("잘못된 장르");
        System.out.println("가장 많은 책이 출판된 장르 = " + maxGenre);
    }

    private static Map<String, Long> q4(List<Book> books) {
        Map<String, Long> genreBookMap = books.stream()
                .collect(Collectors.groupingBy(Book::genre,
                        Collectors.counting()));
        System.out.println("각 장르별로 책의 수 = " + genreBookMap);
        return genreBookMap;
    }

    private static void q2(List<Book> books, String genre) {
        Double novelAvgYear = books.stream().filter(book -> book.genre.equals(genre))
                .collect(Collectors.averagingInt(Book::publishYear));
        System.out.printf("장르가 \"%s\"인 책들의 평균 출판년도 = %.0f \n", genre, novelAvgYear);
    }

    static void q1(List<Book> books) {
        double avgBookPage = books.stream().mapToInt(Book::pages).average().orElse(0.0);
        System.out.printf("모든 책의 평균 페이지 수 = %.0f 페이지\n", avgBookPage);
    }
}
