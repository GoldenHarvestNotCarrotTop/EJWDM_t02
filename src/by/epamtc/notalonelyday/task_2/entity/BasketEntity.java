package by.epamtc.notalonelyday.task_2.entity;

import by.epamtc.notalonelyday.task_2.exception.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BasketEntity implements Serializable {
    private final int DEFAULT_CAPACITY = 10;

    private List<BallEntity> ballsList = new ArrayList<>();

    private double ballsWeight = 0;
    private int capacity;


    public BasketEntity() {
        this.capacity = DEFAULT_CAPACITY;
    }

    public BasketEntity(int capacity) throws IllegalCapacityExcpetion {
        if (capacity < 0) {
            throw new IllegalCapacityExcpetion("Capacity must be positive!");
        }
        this.capacity = capacity;
    }


    public void addBall(BallEntity ball) throws NotEnoughSpaceException, NullEntityException {
        checkIfEntityIsNotNull(ball);
        if (capacity < (size() + 1)) {
            throw new NotEnoughSpaceException("New size will be bigger than capacity!");
        }
        ballsWeight += ball.getWeight();
        ballsList.add(ball);
    }

    public void addBallsFromCollection(Collection<BallEntity> collection) throws NotEnoughSpaceException, NullEntityException {
        checkIfEntityIsNotNull(collection);
        if (capacity < (size() + collection.size())) {
            throw new NotEnoughSpaceException("Not enough space to add balls!");
        }

        for (BallEntity ballEntity : collection) {
            addBall(ballEntity);
        }
    }

    public boolean removeBall(BallEntity ball) throws BasketIsEmptyException, NullEntityException {
        checkIfEntityIsNotNull(ball);
        if (size() == 0)
            throw new BasketIsEmptyException("Can't remove! Basket is empty!");
        for (int i = 0; i < size(); i++) {
            if (ballsList.get(i).equals(ball)) {
                ballsList.remove(i);
                ballsWeight -= ball.getWeight();
                return true;
            }
        }
        return false;
    }


    private void checkIfEntityIsNotNull(Object o) throws NullEntityException {
        if (o == null)
            throw new NullEntityException("Entity must not be null!");
    }


    public int size() {
        return ballsList.size();
    }

    public BallEntity get(int index) throws BallIndexOutOfBoundsException {
        if (index < 0 || size() <= index) {
            throw new BallIndexOutOfBoundsException("Index is out of bounds!");
        }

        return ballsList.get(index);
    }

    public boolean contains(BallEntity ball) throws NullEntityException {
        checkIfEntityIsNotNull(ball);

        for (BallEntity ballEntity : ballsList) {
            if (ballEntity.equals(ball)) {
                return true;
            }
        }
        return false;
    }

    public List<BallEntity> toList() {
        return new ArrayList<>(ballsList);
    }

    public void clear() {
        ballsWeight = 0;
        ballsList.clear();
    }

    public double ballsWeight() {
        return ballsWeight;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasketEntity that = (BasketEntity) o;
        if (size() != that.size())
            return false;
        for (int i = 0; i < size(); i++) {
            try {
                if (get(i).equals(that.get(i))) {
                    return false;
                }
            } catch (BallIndexOutOfBoundsException e) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int ans = 0;
        for (int i = 0; i < size(); i++) {
            ans *= 31;
            ans += ballsList.get(i).hashCode();
        }
        return ballsList.hashCode();
    }

    @Override
    public String toString() {
        return "BasketEntity{" +
                "ballsList=" + ballsList.toString() +
                ", ballsWeight=" + ballsWeight +
                '}';
    }
}
