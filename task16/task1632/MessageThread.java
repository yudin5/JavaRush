package com.javarush.task.task16.task1632;

/**
 * Created by Tigrenok on 24.08.2017.
 */

public class MessageThread extends Thread implements Message {

    @Override
    public void showWarning() {
        interrupt();
    }

    public void run() {
        while(!isInterrupted()) {}
    }
}
