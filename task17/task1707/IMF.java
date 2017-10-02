package com.javarush.task.task17.task1707;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class IMF {

    private static IMF imf;

    public static IMF getFund() {
        //add your code here - добавь код тут
        synchronized (IMF.class) {
            if (imf == null) {
                imf = new IMF();
            }
            return imf;
        }
    }

    private IMF() {
    }
}
