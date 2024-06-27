package variable;

public class Type7 {
    public static void main(String[] args) {
        // 문자열 -> 기본타입으로 강제 변환
        String s1 = "600000";
        int i1 = Integer.parseInt(s1);

        double d1 = Double.parseDouble("3.14");

        // ctrl + alt + v : 타입을 자동으로 추정해주는 단축키
        boolean b = Boolean.parseBoolean("true");

        // 기본타입 => 문자열 강제 변환
        // String.valueOf(primitive 변수);
        String s = String.valueOf(100);
        String s2 = String.valueOf(3.14);
        String s3 = String.valueOf(false);
    }
}
