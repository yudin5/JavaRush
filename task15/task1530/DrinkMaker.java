package com.javarush.task.task15.task1530;

/**
 * Created by Tigrenok on 31.07.2017.
 */

public abstract class DrinkMaker {

    abstract void getRightCup();

    abstract void putIngredient();

    abstract void pour();

    void makeDrink() {
        this.getRightCup();
        this.putIngredient();
        this.pour();
    }
}
