package stream.ex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex7 {
    public static void main(String[] args) {
        List<MovieRating> ratings = Arrays.asList(
                new MovieRating("Inception", 5),
                new MovieRating("The Godfather", 5),
                new MovieRating("Interstellar", 4),
                new MovieRating("Jurassic Park", 3),
                new MovieRating("The Dark Knight", 5),
                new MovieRating("Pulp Fiction", 4),
                new MovieRating("Some Movie", 2)
        );

        /*
            요구사항
            평점이 4 이상인 영화만 필터링하세요.
            peek를 사용하여 필터링된 영화의 이름과 평점을 출력하세요.
            평점이 4 이상인 영화를 영화 이름의 알파벳 순으로 정렬하세요.
         */
        ratings.stream()
                .filter(n -> n.rating >=4 )
                .peek(n -> System.out.println("제목 : " + n.movieName + ", 평점 : " + n.rating))
                .sorted()
                //.sorted(Comparator.comparing(MovieRating::getMovieName))
                // 나는 MovieRating 클래스가 Comparable의 implement라고 추가해주고
                // compareTo 메서드 오버라이딩 했는데,
                // 걍 sort() 메서드에 Comparator 쓰는게 더 나을 듯
                .forEach(System.out::println);

    }

}
class MovieRating implements Comparable<MovieRating> {
    String movieName;
    int rating;

    MovieRating(String movieName, int rating) {
        this.movieName = movieName;
        this.rating = rating;
    }

    String getMovieName() {
        return movieName;
    }

    int getRating() {
        return rating;
    }

    @Override
    public int compareTo(MovieRating o) {
        return movieName.compareTo(o.movieName);
    }

    @Override
    public String toString() {
        return movieName + " (" + rating + ")";
    }
}