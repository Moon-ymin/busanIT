package solid.lsp.after;

public class Main {
    public static void main(String[] args) {
        // LSP 원칙을 어기지 않으면서 
        Bird[] birds = {new Duck(), new Ostrich()};

        for (Bird bird : birds) {
            // bird.fly(); // 새 = 난다가 아님.
        }
        
        // 날 수 있는 새들만 따로 메서드를 구현할 수 있다
        Flyable[] flyables = {new Duck()};
        
        for (Flyable flyable : flyables ){
            flyable.fly();
        }
    }
}
