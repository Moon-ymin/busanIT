package lambda.function;

public class Button {
    // 필드
    private String text;
    private Runnable onClickListener;   // 람다식 함수

    // 생성자
    public Button(String text) {
        this.text = text;
    }
    // 클릭 리스너 설정
    public void setOnClickListener(Runnable onClickListener){
        this.onClickListener = onClickListener;
    }
    public String getText() {
        return text;
    }
    // 클릭 이벤트 발생 시 실행
    public void onClick() {
        onClickListener.run();
    }
}
