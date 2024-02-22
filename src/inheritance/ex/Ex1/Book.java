package inheritance.ex.Ex1;

public class Book {
    // 필드 (protected 접근제어자를 활용하면, 상속관계에서 접근 가능)
    protected String title;
    protected String author;
    protected int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;

    }


    // 메소드
    public void displayInfo() {
        System.out.print("Title: " + title);
        System.out.print(", Author: " + author);
        System.out.print(", Year: " + year);

    }
}