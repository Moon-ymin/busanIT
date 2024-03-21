package stream.ex;

import stream.Stream11;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;

public class Ex14 {
    public static Map<String, Long> genreCounts;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Book> books = Arrays.asList(
                new Book("Java의 정석", "컴퓨터 과학", "남궁성", 2013, 1024),
                new Book("모비 딕", "소설", "허먼 멜빌", 1851, 635),
                new Book("클린 코드", "컴퓨터 과학", "로버트 C. 마틴", 2008, 464),
                new Book("햄릿", "연극", "윌리엄 셰익스피어", 1603, 500),
                new Book("데미안", "소설", "헤르만 헤세", 1919, 248),
                new Book("Effective Java", "컴퓨터 과학", "조슈아 블로크", 2018, 412)
        );



        boolean isFinish = false;
        while (!isFinish){
            System.out.println("""
                    1. 모든 책의 평균 페이지 수 계산
                    2. 특정 장르 책의 평균 출판년도 계산
                    3. 특정 연도 이후 출판된, 최소 페이지 이상 책의 제목 출력
                    4. 각 장르별 책의 수 계산
                    5. 가장 많은 책이 출판된 장르 찾기
                    0. 종료
                            """);
            System.out.print("실행할 작업을 선택하세요: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    /* 수업 방식 1
                    double avgBookPage = books.stream().mapToInt(Book::pages).average().orElse(0.0);
                    System.out.printf("모든 책의 평균 페이지 수 = %.0f 페이지\n",avgBookPage);
                     */
                    IntSummaryStatistics  page = books.stream()
                            .collect(Collectors.summarizingInt(Book::pages));
                    System.out.printf("%.1f 페이지\n",page.getAverage());
                    System.out.println();
                    break;
                case 2:
                    /* 수업 방식 1
                    Double novelAvgYear = books.stream().filter(book -> book.genre.equals("소설"))
                        .collect(Collectors.averagingInt(Book::publishYear));
                    System.out.println("장르가 \"소설\"인 책들의 평균 출판년도 = " + novelAvgYear);
                     */
                    System.out.print("평균 출판년도를 계산할 장르를 입력하세요: ");
                    sc.nextLine();
                    String genre = sc.nextLine();
                    Map<String, Double> genreYearMap = books.stream()
                            .collect(Collectors.groupingBy(Book::genre,
                                    Collectors.averagingDouble(Book::publishYear)
                            ));
                    System.out.printf("[%s] 장르 책의 평균 출판년도: %d 년\n",
                            genre, genreYearMap.get(genre).intValue());
                    System.out.println();
                    break;
                case 3:
                    /* 수업 방식 1
                    List<String> titleList = books.stream()
                            .filter(book ->
                                    book.publishYear > 2010
                                    && book.pages >= 300)
                            .map(Book::title)
                            .collect(Collectors.toList());
                    System.out.println("2010년 이후에 출판된 책들 중 페이지 수가 300페이지 이상인 책의 제목 = " + titleList);
                     */
                    System.out.print("조회할 최소 연도를 입력하세요: ");
                    int startYear = sc.nextInt();
                    System.out.print("조회할 최소 페이지 수를 입력하세요: ");
                    int minPages = sc.nextInt();
                    System.out.printf("%d년 이후 출판되고 %d페이지 이상인 책의 제목들: ", startYear, minPages);

                    List<String> bookTitle = books.stream()
                            .filter(n -> n.publishYear >= startYear && n.pages >= minPages)
                            .map(Book::title)
                            .toList();

                    System.out.println(bookTitle);
                    System.out.println();
                    break;
                case 4:
                    /* 수업 방식 1
                    Map<String, Long> genreBookMap = books.stream()
                            .collect(Collectors.groupingBy(Book::genre,
                                    Collectors.counting()));
                    System.out.println("각 장르별로 책의 수 = " + genreBookMap);
                     */
                    genreCounts = books.stream()
                            .collect(Collectors.groupingBy(Book::genre, Collectors.counting()));

                    System.out.println("각 장르별 책의 수: " + genreCounts);
                    System.out.println();
                    break;
                case 5:
                    /* 수업 방식 1
                    String maxGenre = genreBookMap.entrySet().stream()
                            .max(Comparator.comparing(Map.Entry::getValue))
                            .map(Map.Entry::getKey)
                            .orElse("잘못된 장르");
                    System.out.println("가장 많은 책이 출판된 장르 = " + maxGenre);
                     */
                    String mostPublishedGenre = Collections.max(genreCounts.entrySet(),
                            Map.Entry.comparingByValue()).getKey();
                    System.out.println("가장 많은 책이 출판된 장르: "+ mostPublishedGenre);
                    System.out.println();
                    break;
                case 0:
                    isFinish = true;
                    break;
            }
        }

    }

    public record Book(String title, String genre, String author, int publishYear, int pages) {}
}
