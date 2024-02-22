package inheritance;

public class DmbCellPhone extends CellPhone{
    // 필드 (super클래스의 필드는 모두 가지고)
    int channel; // 새로운 필드를 추가한다

    // 메서드 supperclass의 필드를 가지고
    void turnOnDmb() {      // 새로운 길이 추가
        System.out.println(channel+"번 DMB방송을 수신합니다");
    }
    
    // 메서드 오버라이딩
    @Override
    void bell() {
        super.bell();       // 부모 클래스의 메서드를 그대로 실행
    }
}
