package exception.ex;

public class InvalidAgeException extends RuntimeException{
    public InvalidAgeException(String message) {
        super(message);
    }
}
