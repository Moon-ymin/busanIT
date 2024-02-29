package nested.nested_interface;

public class CallListener implements Button.onClickListener{
    @Override
    public void onClick() {
        System.out.println("통화를 연결합니다.");
    }
}
