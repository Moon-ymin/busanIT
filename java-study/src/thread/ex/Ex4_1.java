package thread.ex;

public class Ex4_1 {
    // 수업에서 한 버전
    // Player 를 굳이 객체로 안만들고 진행
    public static void main(String[] args) {
        ItemShop2 itemShop = new ItemShop2();

        new Thread(() -> itemShop.buyItem("희동이")).start();
        new Thread(() -> itemShop.buyItem("둘리")).start();
        new Thread(() -> itemShop.buyItem("마이콜")).start();
    }
}
class ItemShop2 {
    // 공유 객체 : 아이템 존재여부
    boolean itemAvailable = true;

    // 메서드에 동기화를 적용함으로, 한 번에 하나의 스레드만 접근 허용 가능하게 함
    public synchronized void buyItem(String playerName) {
        if (itemAvailable == true) {
            System.out.println("플레이어 " + playerName + "가 성공적으로 아이템을 구매했습니다.");
            itemAvailable = false;  // 아이템 구매 완료 (매진)
        } else {
            System.out.println("플레이어 " + playerName + " 구매 시도 실패 : 이미 판매되었습니다.");
        }
    }
}
