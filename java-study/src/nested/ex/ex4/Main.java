package nested.ex.ex4;

public class Main {
    public static void main(String[] args) {
        CheckBox checkBox = new CheckBox();

        // 클래스를 만드는 경우
        var listener = new ChangeBackGround();
        checkBox.setOnSelectListener(listener);
        checkBox.select();

        // 익명 클래스로 리스너를 설정하는 경우
        checkBox.setOnSelectListener(new CheckBox.OnSelectListener() {
            @Override
            public void onSelect() {
                System.out.println("배경을 변경합니다. (익명)");
            }
        });
        checkBox.select();
    }
}
