package by.epamtc.notalonelyday.task_2.service;

import by.epamtc.notalonelyday.task_2.entity.BasketEntity;
import by.epamtc.notalonelyday.task_2.enums.Color;
import by.epamtc.notalonelyday.task_2.exception.BallIndexOutOfBoundsException;
import by.epamtc.notalonelyday.task_2.exception.InternalErrorException;
import by.epamtc.notalonelyday.task_2.exception.NullEntityException;

public class BasketService {
    public static int countBallsByColor(BasketEntity basketEntity, Color color) throws InternalErrorException, NullEntityException {
        if(basketEntity == null)
            throw new NullEntityException("BasketEntity must not be null");
        if(color == null)
            throw new NullEntityException("Color must not be null");
        int counter = 0;
        for (int i = 0; i < basketEntity.size(); i++) {
            try {
                if (basketEntity.get(i).getColor() == color) {
                    counter++;
                }
            } catch (BallIndexOutOfBoundsException e) {
                throw new InternalErrorException("Internal error in basketEntity");
            }
        }
        return counter;
    }
}
