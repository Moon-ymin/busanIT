package collection.list.ex.ex3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// 주소록 관리 : 주소록에는 친구들의 정보가 들어가 있다
public class AddressBook {
    // Composition : 필드로 데이터(친구 클래스 리스트)를 가짐
    private List<Friends> friendsList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // 삽입
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
    // 삭제
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
    // 조회
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
    // 출력
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        while(true){
            // """ """ String Template 텍스트를 보이는 그대로 출력
            System.out.print("""
                    1. 친구 추가
                    2. 친구 삭제
                    3. 친구 검색
                    4. 주소록 출력
                    5. 종료
                    선택>""");
            int selectNumber = sc.nextInt();

            // 향상된 switch-case 문
            switch (selectNumber) {
                case 1 -> addressBook.addFriend();
                case 2 -> addressBook.deleteFriend();
                case 3 -> addressBook.searchFriend();
                case 4 -> addressBook.printAllFriends();
                case 5 -> {
                    System.out.println("종료합니다.");
                    return;
                }
                default -> System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
