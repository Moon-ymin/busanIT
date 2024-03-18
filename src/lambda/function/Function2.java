package lambda.function;

public class Function2 {
    public static void main(String[] args) {
        // 매개변수 없고, 리턴값 없는 경우
        Runnable dogSound = () -> System.out.println("멍멍");
        Runnable duckSound = () -> System.out.println("꽥꽥");

        dogSound.run();
        duckSound.run();

        Button dogButton = new Button("개");
        // 클릭 리스너의 매개변수에 "함수"를 설정 : 기존 선언된 변수
        dogButton.setOnClickListener(dogSound);

        Button duckButton = new Button("오리");
        duckButton.setOnClickListener(() -> {
            System.out.println(duckButton.getText()+"의 울음소리");
            System.out.println("꽥꽥");
        });

        dogButton.onClick();
        duckButton.onClick();


    }
}
