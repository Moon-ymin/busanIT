package access_modifier;

public class Radio {
    // 필드
    private int volume;     // 요구사항 : 음량이 10을 넘어서는 안됨. 고장남
    // private으로 접근 제한자를 변경 : 내부에서는 사용 가능 + 외부 불가


    // 메서드
    public void volumeUp() {
        if (volume >= 10) {
            System.out.println("더이상 음량을 증가할 수 없습니다.");
            return; // 메서드 종료
        }
        volume++;
        System.out.println("볼륨을 증가합니다");
    }
    public void volumeDown() {
        volume--;
        System.out.println("볼륨을 감소합니다");
    }
    public void printVolume() {
        System.out.println("현재 볼륨 : " + this.volume);
    }

}
