package lambda.mr;

import java.util.function.BiFunction;
import java.util.function.Function;

public class User {
    // 메서드
    // 매개변수로 문자열 정보를 받아 Member 객체를 반환하는 메서드
    public Member getMember1(Function<String, Member> function){
        String id = "spring";
        Member member = function.apply(id);
        return member;
    }

    public Member getMember2(BiFunction<String, String, Member> function){
        String id = "spring";
        String name = "봄봄";
        Member member = function.apply(id, name);
        return member;
    }


}
