package by.epamtc.notalonelyday.task_2.service;

import by.epamtc.notalonelyday.task_2.entity.BallEntity;
import by.epamtc.notalonelyday.task_2.enums.Color;
import by.epamtc.notalonelyday.task_2.exception.IllegalBallWeightException;

import java.util.concurrent.ThreadLocalRandom;

public class BallService {
    public static BallEntity randomBall(double maxWeight) throws IllegalBallWeightException {

        if (maxWeight < 0)
            throw new IllegalBallWeightException("Max weight must be positive");

        int pick = ThreadLocalRandom.current().nextInt(Color.values().length);
        Color randomColor = Color.values()[pick];

        double randomWeight = ThreadLocalRandom.current().nextDouble(maxWeight);

        return new BallEntity(randomColor, randomWeight);
    }

}
