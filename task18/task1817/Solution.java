package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        int spaceCount = 0;
        int allSymbols = 0;

        try {
            while(inputStream.available() > 0) {
                int symbol = inputStream.read();
                if (symbol == 32) spaceCount++;
                allSymbols++;
            }
        } catch (IOException ex) {
            ex.getMessage();
        }

        inputStream.close();
        double result = (double) spaceCount/allSymbols*100;
        System.out.println(String.format("%.2f", result));

    }
}
