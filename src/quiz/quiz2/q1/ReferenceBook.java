package quiz.quiz2.q1;

public class ReferenceBook extends Book{
    private String field;
    public ReferenceBook(String title, String author, int year, String field) {
        super(title, author, year);
        this.field = field;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.print(", Field : "+field);

    }
}
