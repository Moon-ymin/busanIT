package thread;

public class TazanSong implements Runnable{
    int max;

    public TazanSong(int max) {
        this.max = max;
    }
    @Override
    public void run() {
        String song = "%s : 타잔이 %d원짜리 팬티를 입고, %d원짜리 칼을 차고 노래를 한다. 아아아~\n";

        for (int i = 0; i < max; i++) {
            try {
                Thread.sleep(1500);
                System.out.printf(song, Thread.currentThread().getName(),(i+1)*10, (i+2)*10 );
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
