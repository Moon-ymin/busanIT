package thread.ex;

import java.util.Arrays;

public class Ex4 {
    /*
    연습문제: 온라인 게임의 아이템 상점

    문제 설명:
    여러분은 온라인 게임의 개발자입니다.
    이 게임에는 공유 아이템 상점이 있으며, 여러 플레이어가 동시에 아이템을 구매할 수 있습니다.
    상점에는 한정된 수량의 특별 아이템 단 1개만 있고, 여러 플레이어가 동시에 이 아이템을 구매하려고 합니다.
    특별 아이템은 오직 하나만 존재하며, 먼저 구매한 플레이어에게만 판매됩니다.
    아이템 구매 시도가 성공하면 "플레이어 [이름]이 아이템을 성공적으로 구매했습니다."라고 출력하고,
    실패하면 "플레이어 [이름]의 구매 시도 실패: 아이템이 이미 판매되었습니다."라고 출력합니다.

    요구사항:
    - ItemShop 클래스를 정의하고, buyItem 메서드를 통해 아이템 구매를 처리합니다.
    - buyItem 메서드는 동기화 메서드로 구현하여, 한 번에 한 플레이어만 아이템을 구매할 수 있도록 합니다.
    - 여러 플레이어(스레드)가 아이템을 구매하려고 시도하는 상황을 시뮬레이션합니다.
    - 단 하나의 아이템의 판매 여부는 boolean 필드 itemAvailable으로 관리된다.
     */
    public static void main(String[] args) {
        ItemShop itemShop = new ItemShop();

        Thread ch1 = new Thread(new Player("희동이", itemShop));
        Thread ch2 = new Thread(new Player("둘리", itemShop));
        Thread ch3 = new Thread(new Player("마이콜", itemShop));

        ch3.start();
        ch2.start();
        ch1.start();
    }
}
class Player implements Runnable {
    String name;
    ItemShop itemShop;

    public Player(String name, ItemShop itemShop) {
        this.name = name;
        this.itemShop = itemShop;
    }

    @Override
    public void run() {
        itemShop.buyItem(this);
    }
}
class ItemShop {
    // 공유 객체 : 아이템 존재여부
    boolean itemAvailable = true;

    // 메서드에 동기화를 적용함으로, 한 번에 하나의 스레드만 접근 허용 가능하게 한다
    synchronized public void buyItem(Player player) {
        if (itemAvailable) {
            System.out.printf("플레이어 [%s]이 아이템을 성공적으로 구매했습니다.\n", player.name);
            itemAvailable = false;  // 아이템 구매 완료

        } else {
            System.out.printf("플레이어 [%s]의 구매 시도 실패: 아이템이 이미 판매되었습니다.\n",
                    player.name);
        }
    }
}
