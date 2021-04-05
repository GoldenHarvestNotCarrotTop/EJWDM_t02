package by.epamtc.notalonelyday.task_2.entity;


import by.epamtc.notalonelyday.task_2.enums.Color;
import by.epamtc.notalonelyday.task_2.exception.IllegalBallWeightException;

import java.io.Serializable;
import java.util.Objects;

public class BallEntity  implements Serializable {
    private final Color color;
    private final double weight;

    public BallEntity() {
        color = Color.WHITE;
        weight = 0;
    }

    public BallEntity(Color color, double weight) throws IllegalBallWeightException {
        if (weight < 0)
            throw new IllegalBallWeightException("Weight must be not null positive value");

        this.color = color;
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BallEntity that = (BallEntity) o;
        return Double.compare(that.getWeight(), getWeight()) == 0 && getColor() == that.getColor();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor(), getWeight());
    }

    @Override
    public String toString() {
        return "BallEntity{" +
                "color=" + color +
                ", weight=" + weight +
                '}';
    }
}
