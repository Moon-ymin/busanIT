package generic.ex;

import generic.ex.ex4.Media;

public class Book implements Media {
    String title; String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
