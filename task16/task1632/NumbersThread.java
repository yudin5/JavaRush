package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Tigrenok on 24.08.2017.
 */

public class NumbersThread extends Thread {

    private int summ = 0;

    public void run() {

        BufferedReader numbersReader = new BufferedReader(new InputStreamReader(System.in));

        while (!isInterrupted()) {
            try {
                String s = numbersReader.readLine();
                if (s.equals("N")) {
                    System.out.println(summ);
                    Thread.currentThread().interrupt();
                } else {
                    summ = summ + Integer.parseInt(s);
                }
            } catch (IOException ex) { ex.printStackTrace(); }
        }
    }
}
