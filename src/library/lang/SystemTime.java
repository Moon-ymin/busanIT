package library.lang;

public class SystemTime {
    public static void main(String[] args) throws InterruptedException {
        // 시스템 클래스로 시간 측정
        // 성능 측정이나, 시간 간격 계산에 사용

        // 현재 시간을  milli (1/1000)초 단위로 반환
        long currentTime = System.currentTimeMillis();
        System.out.println(currentTime);
        long time2 = System.currentTimeMillis();
        System.out.println(time2);

        // 현재 시간을 더 높은 정밀도 nano (1/10억)초로 반환
        long nanoTime1 = System.nanoTime();
        System.out.println("nano Time1 : " + nanoTime1);
        long nanoTime2 = System.nanoTime();
        System.out.println("nano Time2 : " + nanoTime2);

        // 시간 측정
        long startTime = System.currentTimeMillis();

        // 시간 측정하고 싶은 작업
        Thread.sleep(3000); // 3초 정도 스레드를 잠재움

        // 작업 이후의 시간 측정
        long endTime = System.currentTimeMillis();

        System.out.println("작업 경과 시간 : " + (endTime - startTime));

    }
}
