package com.javarush.task.task16.task1632;

/**
 * Created by Tigrenok on 24.08.2017.
 */

public class UraThread extends Thread {
    public void run() {
        while (!isInterrupted()) {
            try {
                System.out.println("Ура");
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
