package access_modifier.ex.com.library.management;

public class Book {
    String title;
    String author;

    // 초기화 메서드 단축키 alt + insert
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
}
