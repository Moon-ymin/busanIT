package static0;

public class Final2 {
    public static void main(String[] args) {
        // Magic Number : 소스 코드 내에서 직접적으로 사용되는 의미를 알 수 없는 숫자
        // 코드의 가독성이 저하되고, 로직을 이해하기 어렵고, 같은 값을 여러 곳에 사용할 경우
        // 일관성 유지가 어렵다. => 해결방안 : 상수

//        System.out.println("최대 접속자 수 : " + 10000);
        System.out.println("최대 접속자 수 : " + Constant.MAX_USERS);
        int userCount = 9999;

        connect(userCount++);
        connect(userCount++);
        connect(userCount++);
    }

    static void connect(int userCount) {
        System.out.println("현재 접속자 수 : "+ (userCount));
        if (userCount > Constant.MAX_USERS) {
            System.out.println("현재 서버가 가득찼습니다. 대기해주세요");
        } else {
            System.out.println("접속에 성공하였습니다");
        }
    }

    static void order() {
        int price = 20000;
        String itme = "통큰치킨";
    }
}
