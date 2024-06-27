package thread.ex;

public class Ex5 {
    /*
    연습문제: 마법사의 듀얼

    문제 설명:
    두 명의 마법사가 듀얼을 벌입니다. 각 마법사는 번갈아 가며 마법을 사용하며,
    각자 다른 시간 간격으로 마법을 사용할 수 있습니다.
    마법사 A는 1초마다 불 마법을,
    마법사 B는 1.5초마다 얼음 마법을 사용합니다.
    듀얼은 총 10초 동안 진행되며,
    각 마법사가 마법을 사용할 때마다 사용한 마법과 그 시간을 출력합니다.

    요구사항:
    두 마법사는 별도의 스레드에서 마법을 사용합니다(WizardA 스레드, WizardB 스레드).
    WizardA는 1초 간격, WizardB는 1.5초 간격으로 마법을 사용합니다.
    각 마법 사용 시 "시간 [마법사 이름]이 [마법 종류] 마법을 사용했습니다." 형식으로 출력합니다.
    듀얼은 총 10초 동안 진행되며, 10초가 지나면 두 마법사는 마법 사용을 중단합니다.

    힌트: System.currentTimeMillis()를 사용하여 시작 시간을 기록하고,
    각 마법사의 스레드에서 현재 시간이 시작 시간으로부터 얼마나 지났는지 계산하여
    마법 사용 여부를 결정합니다. Thread.sleep() 메서드를 사용하여 각 마법사의
    마법 사용 간격을 제어할 수 있습니다.
     */
    public static void main(String[] args) {
        Thread WizardA = new Thread( new Wizard("A", 1000, "불"));
        Thread WizardB = new Thread( new Wizard("B", 1500, "얼음"));

        WizardA.start();
        WizardB.start();

        // 10초가 지나면 듀얼이 종료된다
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 인터럽트를 통해 스레드를 종료
        WizardA.interrupt();
        WizardB.interrupt();

        // 두 스레드가 종료될 때까지 기다린다
        try {
            WizardA.join();
            WizardB.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("마법 듀얼이 종료되었습니다.");

    }
}
class Wizard implements Runnable {
    String name;    // 마법사 이름
    int interval;   // 시간간격
    String type;    // 불 또는 얼음

    public Wizard(String name, int interval, String type) {
        this.name = name;
        this.interval = interval;
        this.type = type;
    }

    @Override
    public void run() {
        try {
            // 시간 측정
            long startTime = System.currentTimeMillis();
            // 반복되는 마법 사용
            while (true) {
                long currentTime = System.currentTimeMillis();
                long timeInteger = currentTime - startTime;
                double time = timeInteger / 1000.0;
                // 메시지 포맷
                String formattedMessage = String
                        .format("%.1f초 %s가 %s 마법을 사용했습니다.", time, name, type);
                System.out.println(formattedMessage);

                Thread.sleep(interval);
            }
        } catch (InterruptedException e) {
                // 인터럽트 발생시
                System.out.println("Wizard"+name + "의 마법 사용이 중단되었습니다.");
        }
    }
}

