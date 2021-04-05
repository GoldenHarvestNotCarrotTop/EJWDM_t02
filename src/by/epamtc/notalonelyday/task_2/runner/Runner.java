package by.epamtc.notalonelyday.task_2.runner;

import by.epamtc.notalonelyday.task_2.entity.BallEntity;
import by.epamtc.notalonelyday.task_2.entity.BasketEntity;
import by.epamtc.notalonelyday.task_2.enums.Color;
import by.epamtc.notalonelyday.task_2.reporter.Reporter;
import by.epamtc.notalonelyday.task_2.service.BallService;

public class Runner {
    public static void main(String[] args) {
        final double MAX_WEIGHT = 100;
        final double BALLS_COUNT = 100;

        BasketEntity basket = new BasketEntity();
        for (int i = 0; i < BALLS_COUNT; i++) {
            basket.addBall(BallService.randomBall(MAX_WEIGHT));
        }

        int blueBallsCount = basket.countBallsByColor(Color.BLUE);
        double weight = basket.getBallsWeight();

        Reporter.reportBlueBallsNumber(blueBallsCount);
        Reporter.reportWeight(weight);
    }
}
