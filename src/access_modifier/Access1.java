package access_modifier;

public class Access1 {
    public static void main(String[] args) {
        /* 접근 제한자 access modifier
        클래스의 외부에서 메서드, 필드 등에 접근하는 것을 허용하거난 제한하는 제한자
        public > protected > default > private (접근범위 순 : 왼쪽부터)
         */

        Radio radio = new Radio();
        // radio.volume = 9;   // 객체의 데이터에 직접 접근이 가능
        // private으로 변경 시 외부에서 데이터에 직접 접근이 불가

        radio.volumeUp();   // 10
        radio.volumeUp();   // 제약사항
        radio.printVolume(); // 10
    }
}
