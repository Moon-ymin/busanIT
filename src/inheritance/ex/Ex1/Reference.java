package inheritance.ex.Ex1;

public class Reference extends Book {
    private String field;


    public Reference(String title, String author, int year, String field) {
        super( title, author, year); // 부모 클래스 생성자 호출
        this.field = field;
    }


    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(", Field: "+field);

    }
}
