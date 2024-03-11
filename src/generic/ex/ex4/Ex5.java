package generic.ex.ex4;


import java.util.ArrayList;
import java.util.List;


public class Ex5 {
    public static void main(String[] args) {
        List<Media> myMediaList = new ArrayList<>();
        myMediaList.add(new Book("1984", "George Orwell"));
        myMediaList.add(new Movie("The Matrix", "Lana and Lilly Wachowski"));

        printMediaDetails(myMediaList);
    }

    private static void printMediaDetails(List<? extends Media> list) {
        for (int i = 0; i < list.size() ; i++) {
            if( list.get(i) instanceof Book) {
                System.out.println( "Title : " + ( list.get(i)).getTitle() );
                System.out.println( "Author: " + ((Book) list.get(i)).getAuthor());
            } else {
                System.out.println( "Title : " + ( list.get(i)).getTitle() );
                System.out.println( "Author: " + ((Movie) list.get(i)).getDirector());
            }
        }

    }
}
