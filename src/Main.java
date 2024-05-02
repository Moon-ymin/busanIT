public class Main {
    public static void main(String[] args) {
        String a = "  try hello World  ";
        String[] words = a.split("");
        int cnt = 0;
        String answer = "";
        for(String word : words) {
            cnt = word.contains(" ") ? 0 : cnt+1;
            answer += cnt%2 == 0 ? word.toLowerCase() : word.toUpperCase();
        }
        System.out.println(answer);
    }
}
