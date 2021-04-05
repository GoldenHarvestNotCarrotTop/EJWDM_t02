package by.epamtc.notalonelyday.task_2.reporter;

public class Reporter {
    public static void reportString(String s) {
        System.out.println(s);
    }

    public static void reportBlueBallsNumber(int number) {
        reportString("Number of blue balls: " + number);
    }
}
