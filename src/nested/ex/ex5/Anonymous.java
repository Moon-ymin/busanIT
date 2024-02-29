package nested.ex.ex5;

public class Anonymous {
    public Worker field = new Worker() {
        @Override
        public void start() {
            System.out.println("디자인을 합니다.");
        }
    };
    public void method1() {
        Worker localworker = new Worker() {
            @Override
            public void start() {
                System.out.println("개발을 합니다.");
            }
        };
        localworker.start();
    }
    public void method2( Worker worker ) {
        worker.start();
    }
}
