package by.epamtc.notalonelyday.task_2.reporter;

public class Reporter {
    public static void reportString(String s) {
        System.out.println(s);
    }

    public static void reportBlueBallsNumber(int number) {
        reportString("Number of blue balls: " + number);
    }

    public static void reportError(String s){
        reportString("Error: "+ s);
    }

    public static void reportWeight(double weight) {
        reportString("Weight of balls in basket: " + String.format("%.2f", weight));
    }
}
