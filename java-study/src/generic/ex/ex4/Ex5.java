package generic.ex.ex4;


import java.util.ArrayList;
import java.util.List;


public class Ex5 {
    public static void main(String[] args) {
        List<Media> myMediaList = new ArrayList<>();
        myMediaList.add(new Book("1984", "George Orwell"));
        myMediaList.add(new Movie("The Matrix", "Lana and Lilly Wachowski"));
        printMediaDetails(myMediaList);

        List<Book> myBookList = new ArrayList<>();
        myBookList.add( new Book("메밀꽃 필 무렵", "황순원"));
        myBookList.add( new Book("노인과 바다", "어니스트 헤밍웨이"));
        printMediaDetails(myBookList);
    }


    private static void printMediaDetails(List<? extends Media> list) {

        /* 1. 조건문과 instanceof 를 활용하는 방법 으로 진행
        for (int i = 0; i < list.size() ; i++) {
            System.out.println( "Title : " + ( list.get(i)).getTitle() );
            // 책이면 Author, 영화면 Director
            if( list.get(i) instanceof Book) {
                System.out.println( "Author: " + ((Book) list.get(i)).author);
            } else {
                System.out.println( "Director: " + ((Movie) list.get(i)).director());
            }
            System.out.println();
        }
         */
        // 2. 인터페이스 추상 메서드와 오버라이딩 메서드를 추가하는 방법
        // 객체지향적인 방법
        for(Media media : list) {
            System.out.println("Title : " + media.getTitle());
            System.out.println(media.getDetails());
            System.out.println();
        }


    }
}
