package polymorphism.ex.ex4;

public class Main {

    public static void main(String[] args) {
        Cookie gingerBread = new GingerBread();
        Cookie chocoCookie = new ChocoCookie();
        Cookie strawberryCookie = new StrawberryCookie();

        Cookie[] cookies = {gingerBread, chocoCookie, strawberryCookie};

        for (Cookie cookie : cookies) {
            cookie.run();
            cookie.jump();
            // instanceof 연산자를 통한 타입 체크
            if (cookie instanceof GingerBread) {
            } else {
                cookie.specialSkill();
            }
        }
    }
}