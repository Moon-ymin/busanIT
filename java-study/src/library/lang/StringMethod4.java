package library.lang;

public class StringMethod4 {
    public static void main(String[] args) {
        String hello = "Hello, Java!";

        // 대소문자 변환
        System.out.println(hello.toUpperCase());
        System.out.println(hello.toLowerCase());

        String sentence = "Hello, How are you?";

        // 대소문자를 엄격하게 구분하기 때문에 포함 여부를 일반적인 확인 어렵다.
        boolean res1 = sentence.contains("how");
        System.out.println("res1 = " + res1);

        // 영문 텍스트 검색에서 대소문자 입력 무관하게 포함 여부 확인 시 활용
        if (sentence.toUpperCase().contains("HoW".toUpperCase())) {
            System.out.println("how 단어를 포함합니다.");
        } else {
            System.out.println("how 단어를 포함하지 않습니다.");
        }

        if (sentence.toLowerCase().contains("hOw".toLowerCase())) {
            System.out.println("how 단어를 포함합니다.");
        } else {
            System.out.println("how 단어를 포함하지 않습니다.");
        }

    }
}