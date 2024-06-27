package solid.lsp.before;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = {new Duck(), new Ostrich()};

        for (Bird bird : birds) {
            bird.fly();
        }
    }
}
