package exception;

public class SortArrayException extends Exception {
    public SortArrayException() {
    }

    public SortArrayException(String message) {
        super(message);

    }

    public SortArrayException(String message, Throwable cause) {
        super(message, cause);
    }

    public SortArrayException(Throwable cause) {
        super(cause);
    }
}
