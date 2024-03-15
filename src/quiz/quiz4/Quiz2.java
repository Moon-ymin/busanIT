package quiz.quiz4;

public class Quiz2 {
    public static void main(String[] args) {
        String users = "김철수,30,kimcs@gmail.com;이영희,25,younghee@naver.com;박보검,22,bogum@daum.net;김민아,35,mina@gmail.com";

        String[] user = users.split(";");
        String[] name = new String[user.length];
        String[] age = new String[user.length];
        String[] email = new String[user.length];

        for (int i = 0; i < user.length; i++) {
            String[] data = user[i].split(",");
            name[i] = data[0];
            age[i] = data[1];
            email[i] = data[2];
        }

        System.out.println("전체 사용자 수: "+user.length);
        System.out.println("사용자 정보:");
        for (int i = 0; i < user.length; i++) {
            System.out.printf("- 이름: %s, 나이: %s, 이메일: %s\n",
                    name[i], age[i], email[i]);
        }
        System.out.println("\"gmail.com\" 도메인 사용자:");
        for (int i = 0; i < user.length; i++) {
            if (email[i].contains("gmail.com")) {
                System.out.printf("- %s\n", name[i]);
            }
        }
        System.out.println("가장 나이가 많은 사용자:");
        int maxAgeIndex = 0;
        for (int i = 1; i < user.length; i++) {
            if ( Integer.parseInt(age[maxAgeIndex]) < Integer.parseInt(age[i]) ){
                maxAgeIndex = i;
            }
        }
        System.out.printf("- 이름: %s, 나이: %s\n", name[maxAgeIndex], age[maxAgeIndex]);

        int kim = 0;
        for(String n : name){
            if (n.contains("김")) {
                kim++;
            }
        }
        System.out.println("이름에 \"김\"이 포함된 사용자 수:" + kim);

    }
}
