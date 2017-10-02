package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int countSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            Thread current = Thread.currentThread();

            while(!current.isInterrupted()) {
                try {
                    if (countSeconds < 1) {
                        System.out.print("Марш!");
                        return;
                    }
                    else {
                        System.out.print(countSeconds + " ");
                        Thread.sleep(1000);
                    }
                    countSeconds--;
                } catch (InterruptedException ex) {
                    System.out.println("Прервано!");
                    return;
                }
            }
        }
    }
}
