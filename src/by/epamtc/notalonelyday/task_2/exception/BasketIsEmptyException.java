package by.epamtc.notalonelyday.task_2.exception;

public class BasketIsEmptyException extends Exception{
    public BasketIsEmptyException() {
    }

    public BasketIsEmptyException(String message) {
        super(message);
    }

    public BasketIsEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public BasketIsEmptyException(Throwable cause) {
        super(cause);
    }

    public BasketIsEmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
