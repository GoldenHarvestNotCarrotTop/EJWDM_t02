package by.epamtc.notalonelyday.task_2.exception;

public class IllegalBallWeightException extends Exception {
    public IllegalBallWeightException() {
    }

    public IllegalBallWeightException(String message) {
        super(message);
    }

    public IllegalBallWeightException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalBallWeightException(Throwable cause) {
        super(cause);
    }

    public IllegalBallWeightException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
