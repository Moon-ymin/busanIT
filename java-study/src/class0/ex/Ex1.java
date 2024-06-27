package class0.ex;

public class Ex1 {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "웡카";
        movieReview1.review ="*****";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "시민덕희";
        movieReview2.review ="****";

        // 배열
        MovieReview[] movieReviews = new MovieReview[2];
        movieReviews[0] = movieReview1;
        movieReviews[1] = movieReview2;

        for (int i = 0; i < movieReviews.length; i++) {
            System.out.println("영화 "+movieReviews[i].title+"는(은) "+movieReviews[i].review+"점 입니다.");
        }

    }
}
