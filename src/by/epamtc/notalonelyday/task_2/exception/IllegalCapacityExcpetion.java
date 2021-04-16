package by.epamtc.notalonelyday.task_2.exception;

public class IllegalCapacityExcpetion extends Exception{
    public IllegalCapacityExcpetion() {
    }

    public IllegalCapacityExcpetion(String message) {
        super(message);
    }

    public IllegalCapacityExcpetion(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalCapacityExcpetion(Throwable cause) {
        super(cause);
    }

    public IllegalCapacityExcpetion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
