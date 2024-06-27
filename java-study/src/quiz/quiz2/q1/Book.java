package quiz.quiz2.q1;

public class Book {
    protected String title;
    protected String author;
    protected int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void displayInfo(){
        System.out.print("Title : "+title);
        System.out.print(", Author : "+author);
        System.out.print(", Year : "+year);
    }
}
