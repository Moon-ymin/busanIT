package thread;

public class DeadLock2 {
    // 식사하는 철학자들 문제
    public static void main(String[] args) {
        // 포크 5개
        Fork[] forks = new Fork[5];
        // 포크 초기화
        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Fork(i);
        }

        // 철학자 5명
        Philosopher[] philosophers = new Philosopher[5];
        // 철학자 초기화 : 원형테이블
        for (int i = 0; i < philosophers.length; i++) {
            Fork leftFork = forks[i];
            Fork rightFork = forks[(i+1) % forks.length];
            philosophers[i] = new Philosopher(leftFork, rightFork);
            new Thread(philosophers[i], "철학자 " + (i+1)).start();
        }
    }
}

class Fork {
    // 포크는 id를 가짐
    int id;

    public Fork(int id) {
        this.id = id;
    }
}
class Philosopher implements Runnable{
    // 철학자는 양 손에 포크를 갖는다
    Fork leftFork;
    Fork rightFork;

    public Philosopher(Fork leftFork, Fork rightFork) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        while (true) {
            // 1. 일정시간 생각한다
            System.out.println(name + "가 생각한다.");
            // 2. 왼쪽 포크가 사용가능할 때까지 대기 -> 사용 가능하면 집어든다
            synchronized (leftFork) {
                System.out.println(name + "가 왼쪽 포크를 든다.");

                // 3. 오른쪽 포크가 사용가능할 때까지 대기 -> 사용 가능하면 집어든다
                synchronized (rightFork) {
                    System.out.println(name + "가 오른쪽 포크를 든다.");
                    // 4. 양쪽 포크를 잡으면 식사한다
                    System.out.println(name + "가 식사를 한다.");
                }
                // 5. 오른쪽 포크를 내려놓는다
                System.out.println(name + "가 오른쪽 포크를 내려놓는다.");
            }
            // 6. 왼쪽 포크를 내려놓는다
            System.out.println(name + "가 왼쪽 포크를 내려놓는다.");
        }
            // 7. 처음으로 돌아간다
    }
}
