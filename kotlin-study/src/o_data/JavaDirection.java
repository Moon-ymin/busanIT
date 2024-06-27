package o_data;

public enum JavaDirection {
    NORTH("북"), SOUTH("남"), EAST("동"), WEST("서");

    // 열거형도 필드와 생성자 메서드를 가질 수 있음
    // 필드
    String code;

    // 생성자
    JavaDirection(String code) {
        this.code = code;
    }

    // 메서드
    public String getCode() {
        return  code;
    }
}
