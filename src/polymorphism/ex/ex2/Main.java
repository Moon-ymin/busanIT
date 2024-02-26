package polymorphism.ex.ex2;

public class Main {
    public static void main(String[] args) {
        Transport[] transports = {new Car(), new Bicycle(), new Train()};

        for( Transport transport : transports){
            transport.move();
        }
    }

}
