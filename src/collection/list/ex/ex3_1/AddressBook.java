package collection.list.ex.ex3_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//
/*
    연습문제 주소록 관리 : 메서드 채우기
    친구 정보 등록하기
    사용자로부터 친구의 이름, 이메일, 전화번호를 입력받아 주소록에 저장합니다.
    친구 정보 삭제하기
    사용자로부터 삭제할 친구의 이름을 입력받아 해당 친구를 주소록에서 삭제합니다.
    친구 정보 검색하기
    사용자로부터 검색할 친구의 이름을 입력받아 해당하는 친구의 정보를 출력합니다.
    전체 주소록 출력하기
    주소록에 저장된 모든 친구의 정보를 출력합니다.
 */
public class AddressBook {
    // Composition : 필드로 데이터(친구 클래스 리스트)를 가짐
    private List<Friend> friendsList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // 삽입
    public void addFriend() {
        System.out.print("친구 이름을 입력하세요 : ");
        String name = scanner.nextLine();
        System.out.print("친구 이메일을 입력하세요 : ");
        String email = scanner.nextLine();
        System.out.print("친구 전화번호를 입력하세요 : ");
        String phoneNumber = scanner.nextLine();

        friendsList.add(new Friend(name, email, phoneNumber));
        System.out.println("주소록에 추가되었습니다.");
    }
    // 삭제
    public void deleteFriend() {
        System.out.print("삭제할 친구 이름을 입력하세요 : ");
        String name = scanner.nextLine();

        Iterator<Friend> iterator = friendsList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getName().equals(name)) {
                iterator.remove();  // 안전한 삭제
                // friendsList.remove(name) // X
                System.out.println(name + "님의 주소록 정보가 삭제되었습니다.");
            }
        }
    }
    // 조회
    public void searchFriend() {
        System.out.print("조회할 친구 이름을 입력하세요 : ");
        String name = scanner.nextLine();
        boolean isSearched = false;
        for (Friend friend : friendsList) {
            if (name.equals(friend.getName())) {
                System.out.println(friend);
                isSearched = true;
            }
        }
        if (!isSearched) System.out.println("찾을 수 없는 이름입니다.");
    }

    // 출력
    public void printAllFriends() {
        for (Friend friend : friendsList) {
            System.out.println(friend.toString());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        while(true) {
            // """ """ String Template 텍스트를 보이는 그대로 출력
            System.out.print("""
                    1. 친구 추가
                    2. 친구 삭제
                    3. 친구 검색
                    4. 주소록 출력
                    5. 종료
                    선택> 
                    """);
            int select = scanner.nextInt();

            // 향상된 switch-case문
            switch (select) {
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
