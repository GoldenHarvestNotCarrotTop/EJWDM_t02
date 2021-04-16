package by.epamtc.notalonelyday.task_2.exception;

public class IllegalCapacityException extends Exception{
    public IllegalCapacityException() {
    }

    public IllegalCapacityException(String message) {
        super(message);
    }

    public IllegalCapacityException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalCapacityException(Throwable cause) {
        super(cause);
    }

    public IllegalCapacityException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
