package nested.ex.ex2;

public class Main {
    public static void main(String[] args) {
        Button button = new Button();
        button.click(); // 클릭 리스너가 없는경우 NPE
        button.setOnClickListener( new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("버튼이 클릭되었습니다.");
            }
        });

        button.click();
    }
}
