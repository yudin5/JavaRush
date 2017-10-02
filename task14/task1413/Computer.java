package com.javarush.task.task14.task1413;

/**
 * Created by Tigrenok on 26.07.2017.
 */

public class Computer {

    private Mouse mouse;
    private Keyboard keyboard;
    private Monitor monitor;

    public Mouse getMouse() {
        return mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}
