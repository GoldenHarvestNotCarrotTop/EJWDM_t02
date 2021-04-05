package by.epamtc.notalonelyday.task_2.entity;

import by.epamtc.notalonelyday.task_2.enums.Color;

import java.io.Serializable;
import java.util.*;

public class BasketEntity implements Serializable {
    private final Stack<BallEntity> ballsList = new Stack<>();

    private final Map<Color, Integer> colorsCounterMap = new HashMap<>();


    private double ballsWeight = 0;


    public BasketEntity() {
    }


    public void addBall(BallEntity ball) {
        colorsCounterMap.put(ball.getColor(), colorsCounterMap.getOrDefault(ball.getColor(), 0) + 1);
        ballsWeight += ball.getWeight();
        ballsList.add(ball);
    }

    public BallEntity pop() {
        if (ballsList.size() > 0) {
            BallEntity ball = ballsList.pop();

            int newCount = colorsCounterMap.getOrDefault(ball.getColor(), 0) - 1;
            if (newCount != 0)
                colorsCounterMap.put(ball.getColor(), newCount);
            else
                colorsCounterMap.remove(ball.getColor());

            ballsWeight -= ball.getWeight();
            return ball;
        } else {
            return null;
        }
    }

    public BallEntity lastElement() {
        if (ballsList.size() > 0)
            return ballsList.lastElement();
        else
            return null;
    }

    public List<BallEntity> getBallsList() {
        return new ArrayList<>(ballsList);
    }

    public void setBallsList(List<BallEntity> ballsList) {
        this.clear();
        for (var ball : ballsList) {
            addBall(ball);
        }
    }

    public void clear() {
        this.ballsList.clear();
        this.colorsCounterMap.clear();
        this.ballsWeight = 0;
    }

    public double getBallsWeight() {
        return ballsWeight;
    }

    public int countBallsByColor(Color color) {
        return colorsCounterMap.getOrDefault(color, 0);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasketEntity that = (BasketEntity) o;
        return Double.compare(that.getBallsWeight(), getBallsWeight()) == 0 && Objects.equals(colorsCounterMap, that.colorsCounterMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colorsCounterMap);
    }

    @Override
    public String toString() {
        return "BasketEntity{" +
                "ballsList=" + ballsList.toString() +
                ", ballsWeight=" + ballsWeight +
                '}';
    }
}
