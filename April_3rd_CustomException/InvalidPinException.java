package April_3rd_CustomException;

public class InvalidPinException extends RuntimeException{
    String message;
    public InvalidPinException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
