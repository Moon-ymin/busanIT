package nested.nested_interface;

public class Button {
    // 중첩 인터페이스 : 클래스의 멤버로 선언된 인터페이스
    // 해당 클래스와 긴밀한 관계를 맺는 구현 클래스
    // 정적 멤버와 인스턴스 멤버로 사용 가능
    // UI 프로그래밍에서 이벤트 처리 목적으로 많이 활용됨
    static interface onClickListener{
        // 추상 메서드
        void onClick();
    }

    // 필드
    onClickListener listener;

    // 필드 설정자
    public void setListener(onClickListener listener) {
        this.listener = listener;
    }

    // 터치를 할 경우 클릭 리스터를 호출하는 메서드
    void touch() {
        listener.onClick();
    }
}
