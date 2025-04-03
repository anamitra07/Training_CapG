package April_3rd_CustomException;

public class InsufficientBalanceException extends RuntimeException {
    public  InsufficientBalanceException(String message) {
        super(message);
    }
}
