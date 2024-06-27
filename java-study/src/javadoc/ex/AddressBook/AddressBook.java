package AddressBook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * 주소록 관리 : 주소록에는 친구들의 정보가 들어가 있다
  */
public class AddressBook {
    /**
     * Composition : 필드로 데이터(친구 클래스 리스트)를 가짐
     */
    private List<Friends> friendsList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    /**
     * 친구 목록 삽입 메서드
     */
    public void addFriend() {
        System.out.print("친구 이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("친구 이메일을 입력하세요 : ");
        String email = sc.nextLine();
        System.out.print("친구 전화번호를 입력하세요 : ");
        String phoneNumber = sc.nextLine();

        friendsList.add(new Friends(name, email, phoneNumber));
        System.out.println("주소록에 추가되었습니다.");
    }
    /**
     * 친구 목록 삭제 메서드
     */
    public void deleteFriend() {
        // 친구 이름으로 삭제할거임
        System.out.print("삭제할 이름을 입력하세요 : ");
        String name = sc.nextLine();

        boolean isExist = false;
        Iterator<Friends> iter = friendsList.iterator();

        while (!isExist) {
            while(iter.hasNext()){
                Friends friends = iter.next();
                if (name.equals(friends.getName())) {
                    iter.remove();
                    System.out.println("주소록에서 삭제되었습니다.");
                    isExist = true;
                    break;
                }
            }
            if(!isExist) System.out.println("삭제할 정보가 없습니다.");
            break;
        }

    }
    /**
     * 친구 목록 조회 메서드
     */
    public void searchFriend() {
        // 친구 이름으로 찾을거임
        System.out.print("조회할 이름을 입력하세요 : ");
        String name = sc.nextLine();
        boolean isFind = false;

        while(!isFind) {
            for (Friends f : friendsList) {
                if (f.getName().equals(name)){
                    System.out.printf("이름 : %s, 이메일 : %s, 전화번호 : %s",
                            name,
                            f.getEmail(),
                            f.getPhoneNumber());
                    System.out.println();
                    isFind = true;
                    break;
                }
            }
            if(!isFind) System.out.println("찾으시는 정보가 없습니다.");
            break;
        }


    }
    /**
     * 친구 목록 출력 메서드
     */
    public void printAllFriends() {
        if (friendsList.isEmpty()) {
            System.out.println("주소록이 비어있습니다.");
        }
        for (int i = 0; i < friendsList.size(); i++) {
            System.out.printf("이름 : %s, 이메일 : %s, 전화번호 : %s",
                    friendsList.get(i).getName(),
                    friendsList.get(i).getEmail(),
                    friendsList.get(i).getPhoneNumber()
            );
            System.out.println();
        }
        System.out.println();
    }

    public class Friends {
        private String name;
        private String email;
        private String phoneNumber;

        public Friends(String name, String email, String phoneNumber) {
            this.name = name;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }

        @Override
        public String toString() {
            return super.toString();
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }
    }
}


