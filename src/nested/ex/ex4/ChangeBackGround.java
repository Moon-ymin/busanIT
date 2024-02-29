package nested.ex.ex4;

public class ChangeBackGround implements CheckBox.OnSelectListener{
    @Override
    public void onSelect() {
        System.out.println("배경을 변경합니다.");
    }
}
