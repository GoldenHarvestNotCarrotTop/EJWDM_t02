package by.epamtc.notalonelyday.task_2.exception;

public class NullEntityException extends Exception{
    public NullEntityException() {
    }

    public NullEntityException(String message) {
        super(message);
    }

    public NullEntityException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullEntityException(Throwable cause) {
        super(cause);
    }

    public NullEntityException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
