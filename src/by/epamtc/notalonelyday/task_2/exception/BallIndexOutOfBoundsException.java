package by.epamtc.notalonelyday.task_2.exception;

public class BallIndexOutOfBoundsException extends Exception{
    public BallIndexOutOfBoundsException() {
    }

    public BallIndexOutOfBoundsException(String message) {
        super(message);
    }

    public BallIndexOutOfBoundsException(String message, Throwable cause) {
        super(message, cause);
    }

    public BallIndexOutOfBoundsException(Throwable cause) {
        super(cause);
    }

    public BallIndexOutOfBoundsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
