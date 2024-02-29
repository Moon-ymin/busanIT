package nested.nested_interface;

public class Main {
    public static void main(String[] args) {
        Button button = new Button();

        // 버튼에 어떤 클릭리스너를 구현 객체로 받느냐에 따라
        // 터치 동작에 따라 다른 기능들을 수행하게 된다 (중첩 인터페이스)
        button.setListener(new CallListener());
        button.touch();

        button.setListener(new MessageListener());
        button.touch();
    }
}
