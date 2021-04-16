package by.epamtc.notalonelyday.task_2.exception;

public class NotEnoughSpaceException extends Exception{
    public NotEnoughSpaceException() {
    }

    public NotEnoughSpaceException(String message) {
        super(message);
    }

    public NotEnoughSpaceException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnoughSpaceException(Throwable cause) {
        super(cause);
    }

    public NotEnoughSpaceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
