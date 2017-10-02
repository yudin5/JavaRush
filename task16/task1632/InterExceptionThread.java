package com.javarush.task.task16.task1632;

/**
 * Created by Tigrenok on 24.08.2017.
 */

public class InterExceptionThread extends Thread{
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("InterruptedException");
        }
    }
}
