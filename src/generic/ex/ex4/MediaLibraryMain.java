package generic.ex.ex4;

import java.util.ArrayList;
import java.util.List;

class MediaLibrary<T extends Media>{
    List<T> mediaList;

    public MediaLibrary() {
        mediaList = new ArrayList<>();
    }
    void addMedia(T media){
        mediaList.add(media);
    }
    void printMediaTitles(){
        for (T media : mediaList) {
            System.out.println(media.getTitle());
        }
    }
}

public class MediaLibraryMain {

    public static void main(String[] args) {
        MediaLibrary<Book> bookLibrary = new MediaLibrary<>();
        bookLibrary.addMedia(new Book("The Great Gatsby", "F. Scott Fitzgerald"));

        MediaLibrary<Movie> movieLibrary = new MediaLibrary<>();
        movieLibrary.addMedia(new Movie("Inception", "Christopher Nolan"));

        System.out.println("Books:");
        bookLibrary.printMediaTitles();

        System.out.println("Movies:");
        movieLibrary.printMediaTitles();
    }
}
