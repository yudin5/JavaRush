package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) throw new IllegalArgumentException();
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        switch (args[0]) {
            case "-e":
                inputStream = new FileInputStream(args[1]);
                outputStream = new FileOutputStream(args[2]);
                while(inputStream.available() > 0) {
                    int data = inputStream.read();
                    data++;
                    outputStream.write(data);
                }
                break;

            case "-d":
                inputStream = new FileInputStream(args[1]);
                outputStream = new FileOutputStream(args[2]);
                while(inputStream.available() > 0) {
                    int data = inputStream.read();
                    data--;
                    outputStream.write(data);
                }
                break;
        }
        inputStream.close();
        outputStream.close();
    }

}
