package com.javarush.task.task14.task1421;

/**
 * Created by Tigrenok on 27.07.2017.
 */

public class Singleton {

    //приватное статическое поле
    private static Singleton instance;


    //метод
    public static Singleton getInstance() {
        return instance;
    }

    //приватный конструктор
    private Singleton() {

    }


}
