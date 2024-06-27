package quiz.quiz2.q2;

public class Main {
    public static void main(String[] args) {
        Transport[] transports = {new Car(), new Bicycle(), new Train()};

        for (Transport t : transports){
            t.move();
        }
    }
}
