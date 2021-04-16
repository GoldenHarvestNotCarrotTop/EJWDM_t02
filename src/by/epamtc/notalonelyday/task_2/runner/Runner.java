package by.epamtc.notalonelyday.task_2.runner;

import by.epamtc.notalonelyday.task_2.entity.BasketEntity;
import by.epamtc.notalonelyday.task_2.enums.Color;
import by.epamtc.notalonelyday.task_2.exception.*;
import by.epamtc.notalonelyday.task_2.reporter.Reporter;
import by.epamtc.notalonelyday.task_2.service.BallService;
import by.epamtc.notalonelyday.task_2.service.BasketService;

public class Runner {
    public static void main(String[] args) {
        final double MAX_WEIGHT = 100;
        final int BALLS_COUNT = 100;

        BasketEntity basket = null;
        try {
            basket = new BasketEntity(BALLS_COUNT*2);
        } catch (IllegalCapacityException illegalCapacityException) {
            exitWithError(illegalCapacityException);
        }
        for (int i = 0; i < BALLS_COUNT; i++) {
            try {
                //noinspection ConstantConditions
                basket.addBall(BallService.randomBall(MAX_WEIGHT));
            } catch (NotEnoughSpaceException | NullEntityException | IllegalBallWeightException e) {
                exitWithError(e);
            }
        }

        int blueBallsCount = 0;
        try {
            blueBallsCount = BasketService.countBallsByColor(basket, Color.BLUE);
        } catch (InternalErrorException | NullEntityException e) {
            exitWithError(e);
        }
        double weight = basket.ballsWeight();

        Reporter.reportBlueBallsNumber(blueBallsCount);
        Reporter.reportWeight(weight);
    }

    public static void exitWithError(Exception e){
        Reporter.reportError(e.getMessage());
        System.err.println(e.getMessage());
        System.exit(1);
    }
}
