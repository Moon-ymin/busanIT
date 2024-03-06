package library.lang;

import java.util.Arrays;

public class Ex10 {
    public static void main(String[] args) {
        String userData = "김철수,30,kimcs@gmail.com;이영희,25,younghee@naver.com;" +
                "박보검,22,bogum@daum.net;김민아,35,mina@gmail.com";

        String[] users = userData.split(";");

        String[] names = new String[users.length];
        String[] ages = new String[users.length];
        String[] emails = new String[users.length];
        for (int i = 0; i < users.length; i++) {
            String[] data = users[i].split(",");
            names[i] = data[0];
            ages[i] = data[1];
            emails[i] = data[2];
        }


        System.out.println("전체 사용자 수: "+users.length);
        System.out.println("사용자 정보:");
        for (int i = 0; i < users.length; i++) {
            System.out.printf("- 이름: %s, 나이: %s. 이메일: %s\n",
                    names[i], ages[i], emails[i]);
        }

        System.out.println("\"gmail.com\" 도메인 사용자:");
        for (int i = 0; i < users.length; i++) {
            if ( emails[i].contains("gmail.com") ){
                System.out.println("- "+names[i]);
            }
        }

        int maxage = Integer.parseInt( ages[0] );

        for (String s : ages) {
            maxage = (Math.max(maxage, Integer.parseInt(s)));
        }
        int index = Arrays.asList(ages).indexOf( Integer.toString(maxage));
        System.out.println("가장 나이가 많은 사용자:");
        System.out.println("- 이름: "+ names[index]+", 나이: "+maxage);

        System.out.print("이름에 \"김\"이 포함된 사용자 수: ");
        int kim = 0;
        for (String s : names){
            if ( s.contains("김") ) kim++;
        }
        System.out.println(kim);
    }
}
